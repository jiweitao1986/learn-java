/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.annotation.json;

import static java.lang.System.out;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author jiwt
 */
public class ObjectToJsonConverter {

    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            // throw new JsonSerializationException("The object to serialize is null");
            out.println("The object to serialize is null");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
//            throw new JsonSerializationException("The class "
//                    + clazz.getSimpleName()
//                    + " is not annotated with JsonSerializable");
            out.println("The class "
                    + clazz.getSimpleName()
                    + " is not annotated with JsonSerializable");
        }
    }

    private void initializeObject(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    private String getJsonString(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementsMap.put(getKey(field), (String) field.get(object));
            }
        }

        String jsonString = jsonElementsMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\""
                + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }
    
    public String convertToJson(Object object) {
        try {
            checkIfSerializable(object);
            initializeObject(object);
            return getJsonString(object);
        } catch (Exception e) {
            return "";
//            throw new JsonSerializationException(e.getMessage());
        }
    }

    private String getKey(Field field) {
        String key = field.getAnnotationsByType(JsonElement.class)[0].key();
        if (key.isEmpty()) {
            key = field.getName();
        }
        return key;
    }

}
