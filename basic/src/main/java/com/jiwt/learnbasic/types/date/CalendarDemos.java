/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.types.date;

import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import static com.jiwt.learnbasic.DisplayUtil.*;

/**
 *
 * @author jiwt
 */
public class CalendarDemos {
    public static void run() {
        showTitle("CalendarDemos");
        getMethodDemos();
    }
    
    
    public static void createCaleandar() {
        
        // 
        Calendar calendar = Calendar.getInstance();
        
        // 
        TimeZone timeZone = TimeZone.getDefault();
        calendar = Calendar.getInstance(timeZone);
        
        //
        Date date = new Date();
        calendar.setTime(date);        
    }
    
    public static void getMethodDemos() {
        showSubTitle("getMethodDemos");
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.FEBRUARY, 2);

        showContent("YEAR: " + calendar.get(Calendar.YEAR));
        showContent("MONTH: " + calendar.get(Calendar.MONTH));

        showContent("DATE: " + calendar.get(Calendar.DATE));
        showContent("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        showContent("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        showContent("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        
        showContent("HOUR: " + calendar.get(Calendar.HOUR));
        showContent("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));

        showContent("MINUTE: " + calendar.get(Calendar.MINUTE));

        showContent("SECOND: " + calendar.get(Calendar.SECOND));
        showContent("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));

        showContent("ZONE_OFFSET: " + calendar.get(Calendar.ZONE_OFFSET));
        showContent("TimeZone ID: " + calendar.getTimeZone().getID());
    }
}
