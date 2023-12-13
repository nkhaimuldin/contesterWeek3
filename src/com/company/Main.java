package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double min = min(min(a, b), min(b, c));
        double max = max(max(a,b), max(b,c));
        System.out.println(min+" "+max);
    }
    public static double min(double a, double b){
            if(a<b)
                return a;
            else
                return b;
    }
    public static double max(double a, double b){
        if(a>b)
            return a;
        else
            return b;
    }

}
