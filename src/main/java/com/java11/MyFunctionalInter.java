package com.java11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface MyFunctionalInter {
    String getAPIGateway(String name);

    default public double getRandom(){
        return new Random().nextDouble();
    }

    static String getDate(String pattern){
        return new SimpleDateFormat(pattern).format(new Date());
    }
}
