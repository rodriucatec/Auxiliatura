package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String variable;
        int numero;
        Scanner scan = new Scanner(System.in);
        variable = scan.nextLine();

        //Comparamos si la variable es igual igual a 'uno'
        if (variable.equals("uno")){
            System.out.println("Es uno");
        }
        else {
            System.out.println("No es");
        }

        numero = scan.nextInt();
        if (numero==1){
            System.out.println("Es uno");
        }
        else{
            System.out.println("No es");
        }


    }
}
