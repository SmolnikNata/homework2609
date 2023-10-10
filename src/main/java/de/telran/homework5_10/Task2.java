package de.telran.homework5_10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите диаметр первой пиццы:");
        int pizza1 = scanner.nextInt();
        System.out.println("Введите диаметр второй пиццы:");
        int pizza2 = scanner.nextInt();

        int result = extraCalories(pizza1,pizza2);
        System.out.println("Итого лишних калорий:" + result);
    }
    static int extraCalories (int p1,int p2){
        int calories1cm = 40;
        int caloriesp1 = (int) (Math.PI * (p1 * p1)/4) * calories1cm;
        int caloriesp2 = (int) (Math.PI * (p2 * p2)/4) * calories1cm;
        int extraCalories = Math.abs(caloriesp1 - caloriesp2);
        return extraCalories;






        //Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
        //Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
        //
        //
        //N3
    }
}

