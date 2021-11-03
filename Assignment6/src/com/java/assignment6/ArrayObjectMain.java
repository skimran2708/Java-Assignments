package com.java.assignment6;

public class ArrayObjectMain {
    public static void main(String[] args){

        // array of object references to ArrayObject class
        ArrayObject[] obj = new ArrayObject[2];

        // II-part solution
        obj[0] = new ArrayObject("hello");
        obj[1] = new ArrayObject("world");

        System.out.println(obj[0]);
    }
}