package com.oy.front_and_rear_separation.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getDateString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }
}
