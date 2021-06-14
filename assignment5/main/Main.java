package vyshnavi.assignment.main;

import vyshnavi.assignment.data.Data;
import vyshnavi.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data();
        Singleton singleton=new Singleton();
        data.printVariables();
        data.printLocalVariables();
       // Singleton.initialize("IamString");
        singleton.printString();
    }
}
