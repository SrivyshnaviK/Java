package com.Vyshnavi.assignments.assignment7;

public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("I am Gerbil");
    }
    @Override
    public void gnaw(){
        System.out.println("Gerbil Gnaw");
    }
    @Override
    public void excavate(){
        System.out.println("Gerbil Excavate");
    }
    @Override
    public void defend(){
        System.out.println("Gerbil Defend");
    }
}
