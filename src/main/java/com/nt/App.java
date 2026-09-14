package com.nt;

public class App {
    public static void main(String[] args) {
        System.out.println("HELLO World!!");
        System.out.println("Welcome World!");
    }
    public static void printSomething() {
        System.out.println("Print Something");
    }

    public static void doSomething() {
        System.out.println("Do Something");
    }


    public int getI() {
        return icon+1;
    }
    int icon=0;
    int  icon2=0;
    public int getI2() {
        icon2=icon-1;
        return icon2;
    }
    public int getI3() {
       icon2=icon+1;
       return icon2;
    }

    public static int adition(int a, int b) {
        return a - b;
    }
}
