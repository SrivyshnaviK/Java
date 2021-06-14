package com.Vyshnavi.assignments;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;

class Median {
    public void pingHost(String host) throws IOException {
        long time= System.currentTimeMillis();
        Inet4Address inetAddress= (Inet4Address) Inet4Address.getByName(host);
        if(inetAddress.isReachable(5000)) {
            System.out.println("Pining to.." + host);
            time=System.currentTimeMillis()-time;
            System.out.println("Median:"+time);
        }
        else
            System.out.println("Host is not reachable");
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Host Address:");
        String host=sc.next();
        new Median().pingHost(host);
    }
}
