/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learn.annotation;

import com.jiwt.learn.DisplayUtil;
import com.jiwt.learn.annotation.json.*;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jiwt
 */
public class AnnotationDemos {

    public static void run() {
        DisplayUtil.showTitle("AnnotationDemos");
        runJsonDemo();
    }

    public static void runJsonDemo() {
        DisplayUtil.showSubTitle("JsonDemos");
        Person person = new Person("code0001", "Name0001", "111");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        try {
            String jsonString = serializer.convertToJson(person);
            DisplayUtil.showContent(jsonString);
        } catch (Exception ex) {
            // Logger.getLogger(AnnotationDemos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
