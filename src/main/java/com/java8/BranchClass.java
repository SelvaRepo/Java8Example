package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BranchClass {
    public void addbyMater(){}

      public static void main(String[] args) {

        String email = "selva@matson.com";

        System.out.println("=="+email.indexOf("."));
        System.out.println("UserName =="+email.substring(0,email.indexOf("@")));
    }
}
