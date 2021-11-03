package com.java.assignment7.interfaceinheritance;

public class Main {
    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();

        Concrete concrete = new Concrete();
        obj.method1(concrete);
        obj.method2(concrete);
        obj.method3(concrete);
        obj.method4(concrete);
    }
}
