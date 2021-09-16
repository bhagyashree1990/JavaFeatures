package com.java17.test;

public class PatternMatchingDemo {
    void outputValueInUpperCase(Object obj){
        if(obj instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }
}