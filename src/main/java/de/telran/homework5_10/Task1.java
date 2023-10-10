package de.telran.homework5_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:" );
       String num = scanner.next(); // ввод пользователя
        System.out.print("В какой системе исчисления ваше число:" );
        int notation = scanner.nextInt();
        System.out.print("В какую систему исчисления хотите перевести: ");
        int calculation = scanner.nextInt();

        String result = convert(num, notation,calculation);
        //объявили переменные выше
        System.out.println("Результат: " + result);

    }

    static String convert(String x, int y,int z){
    long mylong = Long.parseLong(x, y);
    return Long.toString(mylong, z);

     // новая переменная для создания операции чб перевести число в 10ю систему счисления для начала
    }
}



//1 уровень сложности: N1
//Переведите число 333 из 16-ричной в 10-ричную
//Переведите число 819 из 10-ричной в 16-ричную
//101101 в двоичной, переведите в 10-ричную
//124 в десятичной, переведите в 2-ичную