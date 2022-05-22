package com.perscholas.java_practice;

import java.util.*;

interface DataType<T>{
 void addition(T a, T b);
 void subtraction(T a, T b);
 void multiplication(T a, T b);
 void division(T a, T b);   
}

class StringDataType<T> implements DataType<T> {
    
    public void addition(T a, T b) {
        String stringA = (String) a;
        String stringB = (String) b;
        System.out.println("Adding two strings");
        System.out.println("The result is: " + (stringA + stringB));
    }
    
    public void subtraction(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }
    
    public void multiplication(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }
    
    public void division(T a, T b) {
        System.out.println("Can't perform this operation on strings");
    }
    
    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}

class NumericDataType<T> implements DataType<T> {
    
    public void addition(T a, T b) {
        Integer i = 0;
        Long l = (long) i;

        System.out.println("Adding 2 generic instances");
        
        if (a.getClass() == i.getClass()) {
            Integer intA = (Integer) a;
            Integer intB = (Integer) b;
            System.out.println("The result is: " + (intA + intB) + ".00");
        } else if (b.getClass() == l.getClass()) {
            Long longA = (Long) a;
            Long longB = (Long) b;
            System.out.println("The result is: " + (longA + longB) + ".00");
        }
    }
    
    public void subtraction(T a, T b) {
        Integer i = 0;
        Long l = (long) i;

        System.out.println("Subtracting two generic instances");
        
        if (a.getClass() == i.getClass()) {
            Integer intA = (Integer) a;
            Integer intB = (Integer) b;
            System.out.println("The result is: " + (intA - intB) + ".00");
        } else if (b.getClass() == l.getClass()) {
            Long longA = (Long) a;
            Long longB = (Long) b;
            System.out.println("The result is: " + (longA - longB) + ".00");
        }
    }
    
    public void multiplication(T a, T b) {
        Integer i = 0;
        Long l = (long) i;

        System.out.println("Multiplying two generic instances");

        if (a.getClass() == i.getClass()) {
            Integer intA = (Integer) a;
            Integer intB = (Integer) b;
            Integer intC = intA * intB;
            Double d = intC.doubleValue();
            System.out.println("The result is: " + String.format("%.2f", d));
        } else if (b.getClass() == l.getClass()) {
            Long longA = (Long) a;
            Long longB = (Long) b;
            Long longC = longA * longB;
            Double d = longC.doubleValue();
            System.out.println("The result is: " + String.format("%.2f", d));
        }
    }
    
    public void division(T a, T b) {
        Integer i = 0;
        Long l = (long) i;

        System.out.println("Dividing two generic instances");

        if (a.getClass() == i.getClass()) {
            Integer intA = (Integer) a;
            Integer intB = (Integer) b;
            Double d = (intA * 100.00 / intB) / 100.00;
            System.out.println("The result is: " + String.format("%.2f", d));
        } else if (b.getClass() == l.getClass()) {
            Long longA = (Long) a;
            Long longB = (Long) b;
            Double d = (longA * 100.00 / longB) / 100.00;
            System.out.println("The result is: " + String.format("%.2f", d));
        }
    }
        
    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}




public class MorePractice {

}
