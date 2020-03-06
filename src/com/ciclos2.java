package com;

import java.util.Scanner;

public class ciclos2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int num, aux, a=0,b=2;
        int[][] matriz = new int[5][2];

        //num = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese un numero para la posicion ["+i+"]["+j+"]");
                matriz[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
