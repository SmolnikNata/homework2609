package de.telran.homework16_10;

import java.util.Random;

public class Task1{
    public static void main(String[] args){
        Random random = new Random();
        int temp1 = random.nextInt(150);
        System.out.println("Температура первой колбы: "+ temp1  );

       int temp2 = random.nextInt(150);
        System.out.println("Температура второй колбы: " + temp2 );

        boolean isWork = isWork (temp1,temp2);
        if (isWork){
            System.out.println("Машина работает.");

        }else {
        System.out.println("Машина не работает.");}

    }
    public static boolean isWork (int temp1, int temp2) {
        return temp1 >100 && temp2<100; }


}


//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.