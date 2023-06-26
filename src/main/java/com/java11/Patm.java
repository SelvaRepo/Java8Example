package com.java11;

import java.nio.file.Paths;

public class Patm implements MyFunctionalInter{
    @Override
    public String getAPIGateway(String name) {
        String dat = MyFunctionalInter.getDate("MM/dd/yyyy hh:mm:ss");
        return name+ " Gatway on : "+ dat;
    }

    @Override
    public double getRandom() {
        return MyFunctionalInter.super.getRandom();
    }

    public static void main(String[] args) {
        Patm patm = new Patm();
        System.out.println(patm.getAPIGateway("HDFC"));
        System.out.println(patm.getRandom());
    }
}
