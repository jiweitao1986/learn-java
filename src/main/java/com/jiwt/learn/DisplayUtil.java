/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learn;
import static java.lang.System.out;

/**
 *
 * @author jiwt
 */
public class DisplayUtil {

    public static void showTitle(String content) {
        out.println("--------------------" + content + "--------------------");
    }

    public static void showSubTitle(String content) {
        out.println("----------" + content + "----------");
    }
    
    public static void showContent(String content) {
        out.println(content);
    }
}
