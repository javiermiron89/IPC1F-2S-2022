/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean valor = false;

        //Manejo de cadenas en el if
        String cadena = "hola mundo";
        if (cadena.equals("hola mund")) {
            System.out.println("Si entre al if");
        } else {
            System.out.println("No entre al if, entre al else");
        }

        System.out.println("\n\n---------------------");
        //Comparacion de variables
        int num1 = 11;
        int num2 = 11;
        if (num1 > num2) {
            System.out.println("Si cumpli");
        } else {
            System.out.println("No cumpli");
        }

        //Utilizar el Switch
        int opcion = 0;
        System.out.println("MENU");
        System.out.println("1. Aritmetica");
        System.out.println("2. Trigonometria");
        System.out.println("3. Estadistica");
        System.out.println("5. Salir");
        System.out.print("Ingrese un numero: ");
        //El Scanner se encarga de recibir un dato desde el teclado del usuario y lo asigna a una variable
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Entre a Aritmetica");
                break;
            case 2:
                System.out.println("Entre a Trigonometria");
                break;
            case 3:
                System.out.println("Entre a Estadistica");
            case 5:
                System.out.println("Adios!!");
                System.exit(0);
            default:
                System.out.println("Entre al default");
                break;
        }

        //Sentencia While
        System.out.println("\n\n\nWHILE");
        boolean bandera = true;
        int numero = 0;
        while (bandera) {
            System.out.println("Numero: " + numero);
            numero++;
            if (numero == 10) {
                bandera = false;
            }
        }
        
        
        //Sentencia DoWhile
        System.out.println("\n\n\nDO WHILE");
        boolean banderaDoWhile = true;
        int numeroDoWhile = 0;
        do {
            System.out.println("Numero: " + numeroDoWhile);
            if (numeroDoWhile == 10) {
                banderaDoWhile = false;
            }
            numeroDoWhile++;
        } while (banderaDoWhile);
        
        
        //SENTENCIA FOR
        System.out.println("\n\n\nFOR");
        
        for (int i = 0; i <= 6; i++) {
            System.out.println("Numero: " + i);
        }
        

        //HACIENDO UN MENU CON WHILE
        /*
        while (true) {
            int op = 0;
            System.out.println("MENU");
            System.out.println("1. Aritmetica");
            System.out.println("2. Trigonometria");
            System.out.println("3. Estadistica");
            System.out.println("5. Salir");
            System.out.print("Ingrese un numero: ");
            //El Scanner se encarga de recibir un dato desde el teclado del usuario y lo asigna a una variable
            Scanner scan2 = new Scanner(System.in);
            op = scan2.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Entre a Aritmetica");
                    break;
                case 2:
                    System.out.println("Entre a Trigonometria");
                    break;
                case 3:
                    System.out.println("Entre a Estadistica");
                case 5:
                    System.out.println("Adios!!");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
        */

    }

}
