package com.Vyshnavi.assignments.assignment7;

import com.Vyshnavi.assignments.assignment7.Cycle;

public class Unicycle extends Cycle implements Cycles{
    public void balance(){
        System.out.println("Unicycle's Balance");
    }

    @Override
    public void factory() {
        System.out.println("UniCycle's Factory");
    }
}
