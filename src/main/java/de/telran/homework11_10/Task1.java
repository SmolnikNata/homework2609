package de.telran.homework11_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        //boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

        if (canBuy(isEdekaOpen,isReweOpen)) {
            System.out.println("Я могу купить еду: " +canBuy(isEdekaOpen,isReweOpen));
        } else System.out.println("Магазины закрыты.");

    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {

       return isEdekaOpen || isReweOpen;



    }
}

//    public static boolean canBuy1(boolean isEdekaOpen, boolean isReweOpen);{
//        if (isEdekaOpen || isReweOpen) {
//
//         return true;
//    }   if else (isEdekaOpen && isReweOpen){
//          return true;
//    }   else {
//          return false;
//    }
//
//}








// 1) Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.

