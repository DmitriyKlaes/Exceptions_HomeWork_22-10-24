package ru.gb;

import java.util.Calendar;

public class Parser {
    public static Calendar currentCalendar;

    static {
        currentCalendar = Calendar.getInstance();
    }

    public boolean checkDelimiter (String stringForCheck) {
        int expectedDelimiterCount = 2;
        int actualDelimiterCount = stringForCheck.length() - stringForCheck.replace(".", "").length();
        return expectedDelimiterCount == actualDelimiterCount;
    }

    public boolean isDigit (String stringDigit) {
        try {
            Integer.parseInt(stringDigit);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkYear (String stringYear) {
        int year;
        try {
            year = Integer.parseInt(stringYear);
        } catch (Exception e) {
            return false;
        }
        return year >= 1900 && year <= currentCalendar.get(Calendar.YEAR);
    }

    public boolean checkMonth (String stringMonth) {
        int month;
        if (isDigit(stringMonth)) {
            month = Integer.parseInt(stringMonth);
        } else

    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));

    }
}
