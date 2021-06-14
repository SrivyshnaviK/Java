package com.Vyshnavi.assignments;
import java.util.*;

class StringChecker {
    public void checkString(String string)
    {
        HashSet<Character> hashSet=new HashSet<>(); // set to count alphabets.
        for (char c:string.toUpperCase().toCharArray()){
            if(c>='A' && c<='Z') // if it is an alphabet adds to set.
                hashSet.add(c);
        }
        //System.out.println(hashSet.size());
        if(hashSet.size()==26)
            System.out.println("Yes! Input String contain all alphabets.");
        else
            System.out.println("No! Input String does not contain all alphabets.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String string=sc.next();
        StringChecker stringChecker=new StringChecker();
        stringChecker.checkString(string);
    }
}
