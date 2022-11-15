package com.java8.inclass;

class Child{
    public void show(){
        System.out.println("show....");
    }
    public int add(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }
}
public class Parent {
    public static void main(String[] args) {
        Child child = new Child();/*{
            public void show(){
                System.out.println("show inner class....");
            }
            public int add(){
                int a = 11;
                int b = 22;
                int c = a+b;
                return c;
            }
        };*/

        child.show();
        System.out.println("Result ="+child.add());
    }
}
