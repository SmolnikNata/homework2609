package de.telran.Homework9_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ппервое число а: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число b:");
        double b = scanner.nextDouble();
        int c = 10;

        printResult(a, c, b);


    }

    public static void printResult(double a, int c, double b) {
        if (Math.abs(a - c)<Math.abs(b - c)){
            System.out.println(" Число " + a + " ближе к "+ c );}
        else {
            System.out.println("Число " + b + " ближе к "+ c );
        }

    }
}
//1 уровень сложности: №1
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.
