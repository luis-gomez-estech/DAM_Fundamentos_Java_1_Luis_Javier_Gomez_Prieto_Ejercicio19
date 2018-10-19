package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzce una nota del 1 al 10");
        int nota = escaner.nextInt();

        //Lo he hecho a traves de un swith basico
        switch ( nota ) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:

                System.out.println("UNO");
                break;

            case 2:

                System.out.println("DOS");
                break;
            case 3:

                System.out.println("TRES");
                break;
            case 4:

                System.out.println("CUATRO");
                break;
            case 5:

                System.out.println("CINCO");
                break;
            case 6:

                System.out.println("SEIS");
                break;
            case 7:

                System.out.println("SIETE");
                break;

            case 8:

                System.out.println("OCHO");
                break;
            case 9:

                System.out.println("NUEVE");
                break;
            case 10:

                System.out.println("DIEZ");
                break;

            default:
                System.out.println("Has introducido un operador erroneo" );
                break;
        }


    }

}