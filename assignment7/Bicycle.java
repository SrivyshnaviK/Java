package com.Vyshnavi.assignments.assignment7;

public class Bicycle extends Cycle implements Cycles {
    public void balance(){
        System.out.println("Bicycle's Balance");
    }
    @Override
    public void factory() {
        System.out.println("UniCycle's Factory");
    }
}
