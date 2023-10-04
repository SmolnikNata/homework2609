package de.telran.homework2_10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите первое число:");
        int arg1 = scanner.nextInt();
        System.out.print("Ведите второе число:");
        int arg2 = scanner.nextInt();

        printSum(arg1,arg2);
        printDif(arg1,arg2);
        printMult(arg1,arg2);
        printDiv(arg1,arg2);

    }

    static void printSum(int numb1, int numb2){
        int sum = numb1+numb2;
        System.out.println("Сумма= "+sum);
    }
    static void printDif(int numb1, int numb2){
        int dif =numb1-numb2;
        System.out.println("Разность= "+dif);

    }
    static void printMult(int numb1, int numb2){
        int mult = numb1*numb2;
        System.out.println("Произведение= "+mult);}
    static void printDiv(int numb1, int numb2){
        double div = (double) numb1/numb2;
        System.out.println("частное = " + div);}

}
