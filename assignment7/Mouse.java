package com.Vyshnavi.assignments.assignment7;

public class Mouse extends Rodent {
    Mouse(){
        System.out.println("I am Mouse");
    }
    @Override
    public void gnaw(){
        System.out.println("Mouse Gnaw");
    }
    @Override
    public void excavate(){
        System.out.println("Mouse Excavate");
    }
    @Override
    public void defend(){
        System.out.println("Mouse Defend");
    }
}
