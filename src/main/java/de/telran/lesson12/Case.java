package de.telran.lesson12;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число а:");
        int a = scanner.nextInt();

        System.out.print("Введите второе число в:");
        int b = scanner.nextInt();

        System.out.print("Введите арифметическую операцию : +,-,/,*:");
        char strOperation = scanner.next().charAt(0);
        int result;

        switch (strOperation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b!= 0){
                result = a / b;
            } else{
                System.out.println("Делить на ноль нельзя!");
                return;
            }
            break;
            default:
                System.out.println("Неверная операция");
                return;
        }
        System.out.println("Результат =" + result);
    }



}
