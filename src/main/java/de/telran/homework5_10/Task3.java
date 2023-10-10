package de.telran.homework5_10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите сумму в евро: ");
        double euro = scanner.nextDouble();
        double euro2 = 1.05; // курс евро

        double converter = converter(euro,euro2);
        System.out.println(" Итого долларов:" + converter);


    }

    static double converter (double euro, double euro2) {

        double result = euro * euro2;

        return result;
    }

}
//Программа запрашивает у пользователя сумму в Евро для конвертации
//Реализовать метод, который конвертирует полученную сумму в сумму в долларах США