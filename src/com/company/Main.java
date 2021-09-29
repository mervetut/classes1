package com.company;

public class Main {

    public static void main(String[] args) {
        for (int k = 0; k <= 10; k++) {
            double a = k * (Math.PI / 5);
            System.out.print(a + ", ");
            System.out.print(Math.sin(a) + ", ");
            System.out.println(Math.cos(a));
        }
    }
}