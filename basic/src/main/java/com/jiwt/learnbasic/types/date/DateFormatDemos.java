/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.types.date;


import static com.jiwt.learnbasic.DisplayUtil.showTitle;
import static com.jiwt.learnbasic.DisplayUtil.showSubTitle;
import static com.jiwt.learnbasic.DisplayUtil.showContent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jiwt
 */
public class DateFormatDemos {
    
    public static void run() {
        showTitle("DateFormatDemos");

//        getInstanceDemos();
        parseDemos();
//        formatDemos();
    }
    
    public static void parseDemos() {
        showSubTitle("parseDemos");
        
        // https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/text/SimpleDateFormat.html

        
        // 2001-07-04T12:08:56
        String displayPattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        String displayString = "2020-02-02T02:02:02.222";
        
        // RFC822
        String rfcPattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        String rfcString = "2020-02-02T02:02:02.222+0800";
        
        // ISO8601
        String isoPattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
        String isoString = "2020-02-02T02:02:02.222+08:00";
        
        DateFormat sdf = new SimpleDateFormat(isoPattern);
        try {
            Date date = sdf.parse(displayString);
            String dateString = sdf.format(date);
            showContent(dateString);
        } catch( Exception e) {
            showContent(e.getMessage());
        }
    }
    
    public static void formatDemos() {
        showSubTitle("formatDemos");
    }

    public static void getInstanceDemos() {
        showSubTitle("getInstanceDemos");

        Date date = new Date();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat timeInstance = DateFormat.getTimeInstance(DateFormat.LONG);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        
        showContent(dateInstance.format(date));
        showContent(timeInstance.format(date));
        showContent(dateTimeInstance.format(date));
    }
}
