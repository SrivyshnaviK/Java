package com.Vyshnavi.assignments.assignment7;

public class OuterClass {
    class InnerClass{
        InnerClass(){
            System.out.println("Inner Class Called");
        }
    }
    class SecondInnerClass extends InnerClass{
        SecondInnerClass(){
            System.out.println("SecondInnerClass Called");
        }
    }
    SecondInnerClass secondInnerClass=new SecondInnerClass();
}
