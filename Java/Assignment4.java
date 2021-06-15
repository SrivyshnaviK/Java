package com.Vyshnavi.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class KYC_Date{
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=0;
        while(i<5) {
            Date signUpDate = new SimpleDateFormat("dd-MM-yyyy").parse(sc.next());
            Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(sc.next());
            if (signUpDate.getYear() == currentDate.getYear())
                System.out.println("No Range");
            else
            {
                Calendar calendar;
                calendar=Calendar.getInstance();
                calendar.setTime(signUpDate);
                calendar.add(Calendar.DATE , 30);
                Date after30=calendar.getTime();
                calendar.add(Calendar.DATE,-60);
                Date before30=calendar.getTime();

                System.out.print((before30.getDate())+"-");
                System.out.print(before30.getMonth()+1+"-");
                System.out.print(currentDate.getYear()+1900+" ");
                int month=after30.getMonth()+1;
                int year= currentDate.getYear()+1900;
                int day=after30.getDate()+1;
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(day+"-"+month+"-"+year);
                if(date.after(currentDate)) {
                    System.out.print(currentDate.getDate()+"-");
                    System.out.print(currentDate.getMonth()+1+"-");
                    System.out.println(currentDate.getYear()+1900);
                }
                else
                    System.out.print(day+"-"+month+"-"+year);
            }
            i++;
        }

    }
}
