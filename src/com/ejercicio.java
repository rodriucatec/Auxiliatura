package com;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nombre, cadena, aux;
        boolean upper = true;

        nombre = scan.nextLine();

        //Escribir todo en mayuscula
        System.out.println(nombre.toUpperCase());
        //Escribir todo en minuscula
        System.out.println(nombre.toLowerCase());

        //Escribir la primera letra en mayuscula
        System.out.println(nombre.substring(0,1).toUpperCase()+nombre.substring(1,nombre.length()).toLowerCase());

        //Escribir intercalando mayusculas y minusculas
        for (int i = 0; i < nombre.length(); i++) {

            if (upper){
                System.out.print(nombre.substring(i,i+1).toUpperCase());
                upper=false;
            }else{
                System.out.print(nombre.substring(i,i+1).toLowerCase());
                upper=true;
            }
        }
    }
}
