package de.telran.lesson12;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 8;
        int d = 2;
        System.out.println(mult(a,b));
        System.out.println(mult(a,b,c));
        System.out.println(mult(a,b,c,d));

    }
    public static int mult( int a, int b){
            return a * b;
    }
    public static int mult( int a, int b,int c) {
        return a* (mult(b,c));
    }
    public static int mult( int a, int b,int c,int d) {
        return a * (mult(b,c,d));

    }


}
    //Сделайте перегруженные методы для перемножения 2-х, 3-х и 4-х чисел.
    // В методе умножения 3-х чисел используйте вызов метода для 2-х чисел.
        //В методе умножения 4-х чисел – вызов метода для 3-х чисел.