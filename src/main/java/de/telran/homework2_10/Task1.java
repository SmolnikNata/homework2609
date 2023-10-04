package de.telran.homework2_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово с четным количеством букв:");
        String myStr1 = scanner.next();
        int myLength1 = myStr1.length();
        System.out.println("Количество символов:" + myLength1);
        if (myLength1 % 2 ==0){

        } else {
            System.out.println("Введите слово с четным количеством букв!");
            return;
        }

        System.out.println("Введите второе четным количеством букв");
        String myStr2 = scanner.next();

        int myLength2 = myStr2.length();
        System.out.println("Количество символов:" +myLength2);
        if (myLength2 % 2 ==0){

        } else {
            System.out.println("Введите слово с четным количеством букв!");
            return;
        }
        int myInt = myLength1/2;
        int myInt2 = myLength2/2;
        System.out.println("слово, состоящее из первой половины первого слова и второй половины второго слова: " + myStr1.substring(0,myInt) + myStr2.substring(myInt2));


    }
}
// уровень сложности: №1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa