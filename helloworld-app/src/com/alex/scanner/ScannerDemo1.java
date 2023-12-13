package com.alex.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in your age");
        int age = sc.nextInt();
        System.out.println("Your name is :" + age);
        System.out.println("Type in your name");
        String name = sc.next();
        System.out.println( "Welcome ~~"  + name);
    }
}
