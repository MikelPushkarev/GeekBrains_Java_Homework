package com.company;

public class Main {

    public static void main(String[] args) {
        int a = task3(5, 5, 5, 5);
        System.out.println(a);

        boolean x = task4(9, 1);
        System.out.println(x);

        task5(123);

        boolean y = task6 (-2);
        System.out.println(y);

        task7("Mikhail!");

        task8(400);


    }

    public static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task4(int x, int y) {
        if (x + y >= 10&&x+y <=20)
            return true;
        else
            return false;
    }
    public static void task5(int x){
        if (x < 0)
                System.out.println("a is negative");
        else if (x>=0)
                System.out.println ("a is positive");
    }
    public static boolean task6(int y){
        if (y < 0)
            return true;
        else
            return false;
    }
    public static void task7(String name){
        System.out.println("Hello, " +name);
    }

    public static void task8(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Високосный год");
        else
            System.out.println ("Невисокосный год");
    }
}