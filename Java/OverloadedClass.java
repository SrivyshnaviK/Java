package com.Vyshnavi.assignments;

public class OverloadedClass {
    OverloadedClass(){
        this("HelloWorld");
        System.out.println("Constructor without parameters");
    }
    OverloadedClass(String string){
        System.out.println("Overloaded Constructor with string: "+string);
    }
}
