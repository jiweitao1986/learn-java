/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.types.date;

import java.lang.System;

import static com.jiwt.learnbasic.DisplayUtil.*;
import java.util.Date;

/**
 *
 * @author jiwt
 */
public class DateDemos {
    public static void run() {
        
        createDateDemo();
       
    }
    
    
    public static void createDateDemo() {
        showTitle("createDateDemo");
        
        // DateTime based on current time.
        long currentTime = System.currentTimeMillis();
        Date date1 = new Date(currentTime);

        showContent(currentTime);
        showContent(date1.getTime());
        
        Date date2 = new Date();
        showContent(date2.getTime());
       
    }   
    
}
