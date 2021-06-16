package com.Vyshnavi.assignments.assignment8;

public class ErrorHandling {
    public void method() throws NewException1 {
        //throw new NewException1("NewException1");
        //throw new NewException2("NewException2");
        throw new NullPointerException();
    }
        public static void main(String args[]){
            ErrorHandling errorHandling = new ErrorHandling();
            try {
                errorHandling.method();
            } catch (Exception exception) {
                System.out.println(exception);
            } finally {
                System.out.println("Finally Block..");
            }
        }
    }
