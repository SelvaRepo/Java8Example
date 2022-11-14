package com.java8.lamda;

interface Calculator
{
    //void switchon();
    int sum(int i, int b);
}
public class CalculaterImpl {

    public static void main(String s[]){
        /*Calculator cal = () -> {
            System.out.println("### switch on it.");
        };*/
        //Calculator cal = () -> System.out.println("#### switch on it.");
        //cal.switchon();

        Calculator calculater = (int i, int j) -> {
            if (i<j){
                throw new RuntimeException("I is large");
            }
            return (i+j);
        };
        System.out.println("Sum ::"+calculater.sum(30,20));
    }
}
