package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0) {
            a++;
            System.out.println(a);
        }
        else if (a < 0){
            a = a - 2;
            System.out.println(a);}
        else if (a == 0){
            a = 10;
            System.out.println(a);
        }
    }
}
