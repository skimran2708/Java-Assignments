package com.java.assignment7.interfaceinheritance;

public class InterfaceInheritance extends Concrete{
    public void method1(Interface1 temp){
        System.out.println("takes if1 object");
    }

    public void method2(Interface2 temp){
        System.out.println("takes if2 object");
    }

    public void method3(Interface3 temp){
        System.out.println("takes if3 object");
    }

    public void method4(BaseInterface temp){
        System.out.println("takes BaseIf object");
    }
}
