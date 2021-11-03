package com.java.assignment8;

public class ErrorHandling {

    public static void validateVariable(String varName) throws VariableStartWithDollarException, VariableStartWithIntException, VariableStartWithUnderscoreException {
        try {
            System.out.println(varName);
            if(varName.startsWith("$"))
                throw new VariableStartWithDollarException("variable shouldn't start with dollar");
            else if(varName.startsWith("_"))
                throw new VariableStartWithUnderscoreException("variable shouldn't start with underscore");
            else if(varName.matches("[0-9]+[a-zA-Z]*"))
                throw new VariableStartWithIntException("variable shouldn't start with a number");
        } catch(NullPointerException e){
            System.out.println("variable cannot be null");
        }
        finally {
            System.out.println("It is finally block");
        }
    }

    public static void main(String[] args) throws VariableStartWithDollarException, VariableStartWithUnderscoreException, VariableStartWithIntException {
        for(String s : new String[]{"1abc", "_abc", "$abc", null}){
            validateVariable(s);
        }
    }
}
