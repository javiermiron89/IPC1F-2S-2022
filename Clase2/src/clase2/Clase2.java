/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLOS
        int[] notas = new int[7];
        notas[0] = 61;
        notas[6] = 95;
        
        for (int i = 0; i < notas.length; i++) {
            //System.out.println(notas[i]);
        }
        
        //MATRIZ
        int[][] matriz = new int[3][4];
        
        //System.out.println("Filas: " + matriz.length);
        //System.out.println("Columnas: " + matriz[0].length);
        
        matriz[0][0] = 11;
        matriz[1][1] = 7;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //System.out.print(matriz[i][j] + " ");
            }
            //System.out.println("");
        }
        
        //SPLIT
        System.out.println("Ingrese los valores (separados por coma): ");
        Scanner scan = new Scanner(System.in);
        String cadena = scan.next();
        
        String[] datosSeparados = cadena.split(",");
        
        for (int i = 0; i < datosSeparados.length; i++) {
            System.out.println(datosSeparados[i]);
        }
        
        int tamanio = 9;
        double[] datosConvertidos = new double[tamanio];
        
        for (int i = 0; i < datosSeparados.length; i++) {
            datosConvertidos[i] = Double.valueOf(datosSeparados[i]);
        }
        
        /*
        System.out.print("[");
        for (int i = 0; i < datosConvertidos.length; i++) {
            System.out.print(datosConvertidos[i] + " ");
        }
        System.out.println("]");
        */
        double respuesta = moda(datosConvertidos, 9);
        
    }
    
    public static double moda(double[] arreglo, int tamanio) {
        double[] valoresNoRepetidos = new double[tamanio];
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            //Recorrer el valoresNoRepetidos para saber si el numero ya existe
            for (int j = 0; j < valoresNoRepetidos.length; j++) {
                if (valoresNoRepetidos[j] == arreglo[i]) {
                    break;
                } else {
                    if (valoresNoRepetidos[j] == 0) {
                        valoresNoRepetidos[j] = arreglo[i];
                        break;
                    }
                    
                }
            }
        }
        
        for (int i = 0; i < valoresNoRepetidos.length; i++) {
            System.out.print(valoresNoRepetidos[i] + "   ");
        }
        System.out.println("");
        
        int tamanoNoRepetidos = 0;
        for (int i = 0; i < valoresNoRepetidos.length; i++) {
            if(valoresNoRepetidos[i] != 0) {
                tamanoNoRepetidos++;
            }
        }
        
        //Se genera una matriz para hacer la comparacion de modas
        double[][] tabla = new double[tamanoNoRepetidos][2];
        
        
        
        for (int i = 0; i < tamanoNoRepetidos; i++) {
            tabla[i][0] = valoresNoRepetidos[i];
        }
        
        //Contabilizar la cantidad de numeros repetidos
        for (int i = 0; i < arreglo.length; i++) { //Repetir 9 veces
            
            for (int j = 0; j < tabla.length; j++) {
                if(tabla[j][0] == arreglo[i]) {
                    tabla[j][1]++;
                }
            }
            
        }
        
        //Imprimir la tabla
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        return 0.0;
    }
    
}
