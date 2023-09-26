package de.telran.homework2609;

public class homework2 {
    public static void main(String[] args) {
int number =345;
int hundreds = (number/100);
        int dozens = (number/10 % 10);
        int units = (number % 10);
        System.out.println("hundreds"+ hundreds);
        System.out.println("dozens"+ dozens);
        System.out.println("units"+ units);
    }
}
//Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5