package com.java.assignment7.inner;

public class OuterA {
    public static class InnerA{
        InnerA(int a){
            System.out.println("Inner class A non-default constructor " + a);
        }
    }
}
