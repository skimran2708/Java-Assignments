package com.java.assignment7.inner;

public class OuterB {
    public static class InnerB extends OuterA.InnerA {
        InnerB(int a) {
            super(a);
            System.out.println("ClassB");
        }
    }
}
