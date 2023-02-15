package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("1 - Triangle, 2 - Square. Enter:");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        if (value == 1)
        {
            System.out.println("1 line. Enter:");
            int a = scan.nextInt();
            System.out.println("2 line. Enter:");
            int b = scan.nextInt();
            System.out.println("3 line. Enter:");
            int c = scan.nextInt();
            if (a <= 0 || b <= 0 || c <= 0)
            { 
                System.out.println("Value cannot be sub zero");
            }
            else
            {
                float P = a + b + c;
                float p = P/2;
                double S = Math.sqrt(P/2*(P/2-a)*(P/2-b)*(P/2-c));
                System.out.println("P = " + P);
                System.out.println("S = " + S);
            }
        }
        else
        {
        System.out.println("1 line. Enter:");
        int a = scan.nextInt();
        System.out.println("2 line. Enter:");
        int b = scan.nextInt();
        int P = a + a + b + b;
        int S = a*b;
        System.out.println("P = " + P);
        System.out.println("S = " + S);
        }
    }
}
