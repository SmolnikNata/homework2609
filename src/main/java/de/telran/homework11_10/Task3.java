package de.telran.homework11_10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число c: ");
        int c = scanner.nextInt();

        int myGetMax = getMax(a,b,c);

        System.out.println("Наибольшее число: " + myGetMax );

    }

    public static int getMax(int a, int b, int c) {
        if (a > b&& a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        }else return c;
        }

}
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
// Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//Напечатает максимум из трех чисел.