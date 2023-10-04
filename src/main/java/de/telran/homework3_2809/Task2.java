package de.telran.homework3_2809;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите первое число:");
        int numb1 = scanner.nextInt();
        System.out.print("Ведите второе число:");
        int numb2 = scanner.nextInt();
        int sum = numb1 + numb2;
        int dif = numb1 - numb2;
        int mult = numb1 * numb2;
        int div = numb1 / numb2;
        System.out.println("Summer = "+ sum  + ";");
        System.out.println("Different = "+ dif + ";");
        System.out.println("Multiply = "+ mult + ";");
        System.out.println("Divide = "+ div + ";");



    }
}


// № 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль