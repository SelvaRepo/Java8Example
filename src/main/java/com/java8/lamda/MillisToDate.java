package com.java8.lamda;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MillisToDate {

    public static void main(String args[]) {

        //creating Date from millisecond
        Date currentDate = new Date(System.currentTimeMillis());

        DateFormat df = new SimpleDateFormat("ddMMyyHHmmssSSS");

        //formatted value of current Date
        System.out.println("Milliseconds to Date: " + df.format(currentDate));

    }


}
