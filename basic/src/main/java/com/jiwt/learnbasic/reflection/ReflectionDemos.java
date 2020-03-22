/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.reflection;

import com.jiwt.learnbasic.DisplayUtil;
import static java.lang.System.out;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author jiwt
 */
public class ReflectionDemos {

    public static void run() {
        DisplayUtil.showTitle("ReflectionDemos");
        showFields();
        showMethods();
    }
    
    
    public static void showBasicInfo() {
        DisplayUtil.showSubTitle("showClassInfo");

        Class empClass = Employee.class;
        
        // com.jiwt.learn.reflection.Employee 
        out.println("Name: " + empClass.getName());
        
        // false
        out.println("IsInterface: " + empClass.isInterface());
        
        // false
        out.println("IsPrimitive: " + empClass.isPrimitive());
        
        // false
        out.println("IsArray: " + empClass.isArray());


        out.println("SuperName: " + empClass.getSuperclass().getName());

    }
    
    public static void showFields() {
        
        DisplayUtil.showSubTitle("showFields");
        Class empClass = Employee.class;
        Field[] fields = empClass.getFields();
        out.println(String.valueOf(fields.length));
        for ( int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            out.println("Field: " + field.getName());
        }
    }
    
    public static void showMethods() {

        DisplayUtil.showSubTitle("showMethods");

        Class empClass = Employee.class;
        Method[] methods = empClass.getMethods();
        for ( int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            out.println("Method: " + method.getName());
        }
    }
}
