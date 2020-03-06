package com;

import java.util.Scanner;

public class ciclos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nombre;
        int contador=0;

        do {
            nombre = scan.nextLine();
            contador++;
        }while (!nombre.equals("salir"));

        System.out.println(contador-1);

    }
}
