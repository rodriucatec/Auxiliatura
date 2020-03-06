package com;

import java.util.Scanner;

public class metodos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(sumar(a,b));
    }

    //Metodo que devuelve el valor de una suma
    public static int sumar(int a, int b){
        int total;
        total = a+b;
        return total;
    }
}
