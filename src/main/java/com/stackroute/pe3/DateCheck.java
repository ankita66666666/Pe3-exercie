package com.stackroute.pe3;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateCheck {
    public boolean startDate() {
        boolean result = false;
        String string;

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// print date since Monday to Sunday
        DateFormat dateFormat = new SimpleDateFormat(("EEE dd/MM/yyyy"));
        string = dateFormat.format(calendar.getTime());
        System.out.println(string);

        if (string.equals("Mon 15/07/2019")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean endDate() {
        boolean result;
        String string;

        Calendar calender = Calendar.getInstance();

        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

//Formatting date
        DateFormat dateFormat = new SimpleDateFormat(("EEE dd/MM/yyyy"));
        calender.add(Calendar.DATE, 6);
        string = (dateFormat.format(calender.getTime()));

        if (string.equals("Sun 21/07/2019")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}


