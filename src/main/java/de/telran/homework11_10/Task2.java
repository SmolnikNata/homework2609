package de.telran.homework11_10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();


        boolean isLeap = isLeap(year); // обозначаем переменную boolean
        if (isLeap){               // берет значение true
        System.out.println( "Год: " + year + " Високосный");
        }else  System.out.println( "Год: " + year + " Не високосный");


    }
    public static boolean isLeap(int year){

        return ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0);//метод подсчета високосного года
    }
}
    //Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
// Метод isLeap проверяет високосный год или нет.

