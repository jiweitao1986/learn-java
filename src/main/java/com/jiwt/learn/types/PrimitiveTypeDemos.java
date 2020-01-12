/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learn.types;

/**
 *
 * @author jiwt
 */
public class PrimitiveTypeDemos {
    
    public static void run() {
        intDemo();
        decimalDemo();
        byteDemo();
        charDemo();
        boolDemo();
    }
    
    public static void intDemo() {
        
        // 2 Bytes
        short shortNum = 1;
        
        // 4 Bytes
        int intNum = 100;
        
        // 8 Bytes
        long longNum = 1000;
        
        System.out.println(Short.toString(shortNum));
        System.out.println(Integer.toString(intNum));
        System.out.println(Long.toString(longNum));
    }
    
    public static void decimalDemo() {
        float f = 3.14f;
        double d = 3.1415926;

        System.out.println(Float.toString(f));
        System.out.println(Double.toString(d));
    }
    
    public static void byteDemo() {
        
        byte b = 1;

        // 或者
        // String s = String.valueOf(b);
        System.out.println(Byte.toString(b));
    }
    
    public static void charDemo() {
        char c = 'a';
        System.out.println(c);
    }
    
    public static void boolDemo() {
        boolean t = true;
        boolean f = false;
        
        System.out.println(Boolean.toString(t));
        System.out.println(Boolean.toString(f));
    }  
}
