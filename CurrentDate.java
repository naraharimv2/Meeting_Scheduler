package com.andrewvu.meeting_scheduler;

import java.util.Calendar;


public abstract class CurrentDate {
    private static Calendar c = Calendar.getInstance();

    /**
     * getDayOfMonth
     *
     * @return int day of month
     */
    public static int getDayOfMonth() {
        return c.get(Calendar.DAY_OF_MONTH);
    }


    /**
     * getMonth
     *
     * @return return int month (from 0 to 11)
     */
    public static int getMonth() {
        return c.get(Calendar.MONTH);
    }

    /**
     * getYear
     *
     * @return int year
     */
    public static int getYear() {
        return c.get(Calendar.YEAR);
    }

    /**
     * getDate
     *
     * @return String date in form DD/MM/YYYY
     */
    public static String getDate() {
        return (getDayOfMonth() + "/" + (getMonth() + 1) + "/" + getYear());
    }
}
