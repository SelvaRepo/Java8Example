package com.java11;

public class TestClass {
    public static void main(String[] args) {

        MyFunctionalInter function = (name) -> {
            return " Gateway name : " + name;
        };
        System.out.println(function.getAPIGateway("UPI"));
        // static
        System.out.println(MyFunctionalInter.getDate("MM-dd-yyyy"));

    }
}
