package de.telran.homework3_2809;

public class Task1 {
    public static void main(String[] args) {
       String myStr = new String("I study Basic Java!");
        System.out.println(myStr);

        System.out.println("Длина строки: " + myStr.length());
        System.out.println(" пред-последний символ строки:" + myStr.charAt(myStr.length()-2));
        System.out.println("содержит ли ваша строка подстроку “Java”: " + myStr.contains("Java"));
        System.out.println(myStr.substring(14,18));
        System.out.println(myStr.replace('a','o'));
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());



    }
}
//  1 уровень сложности: № 1
//Создайте строку через new - I study Basic Java!
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.



