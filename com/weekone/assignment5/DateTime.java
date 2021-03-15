package com.weekone.assignment5;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 */
public class DateTime {


    public static void main(String[] args) {
        DateTime d = new DateTime();
        System.out.println(d.setBirthDay(5,21,1999));
        listmonday(2);
        Calendar c = new GregorianCalendar();
        c.set(1999,5,13);
        System.out.println(Friday13(c));
    }

    /**
     * sets birth day
     * @param month
     * @param day
     * @param year
     * @return
     */
    public Date setBirthDay(int month, int day, int year){
        Calendar birthday = new GregorianCalendar();
        birthday.set(year,month,day);
        Date date = birthday.getTime();
        return date;
    }

    /**
     * list of all mondays in a month
     * @param mon
     */
    public static void listmonday(int mon){
        String [] months = {"january","february","march","april","june","july","august","September","october","november","december"};

        Month month = Month.valueOf(months[mon].toUpperCase());

        LocalDate date = Year
                .now()
                .atMonth(month)
                .atDay(1)
                .with(TemporalAdjusters
                .firstInMonth(DayOfWeek.MONDAY));

        Month mi = date.getMonth();
        System.out.println("monday in month of "+months[mon]);
        while (mi == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }

    /**
     * check if calender is firiday the 13
     * @param c
     * @return
     */
    public static boolean Friday13(Calendar c){
        return c.get(Calendar.MONTH) == 5 && c.get(Calendar.DATE) == 13;
    }
}
