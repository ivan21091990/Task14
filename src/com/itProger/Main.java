package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println("Значение типа String: " + '"' + s + '"');
        System.out.println("Значение типа int: " +  x);
        System.out.println("Значение типа double: " + y);
        }
    }

