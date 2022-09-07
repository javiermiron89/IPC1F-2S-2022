/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente[] listaClientes = new Cliente[5];

        Cliente cliente1 = new Cliente(1025, "Javier", "Miron");
        Cliente cliente2 = new Cliente(1258, "Juan", "Perez");
        Cliente cliente3 = new Cliente(1469, "Adriana", "Alvarado");

        listaClientes[0] = cliente1;
        listaClientes[1] = cliente2;
        listaClientes[2] = cliente3;

        listaClientes[0].cuentasAsociadas[0] = new Cuenta(1, listaClientes[0].cui, 0.0);
        listaClientes[1].cuentasAsociadas[0] = new Cuenta(2, listaClientes[1].cui, 200);
        
        
        
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null) {
                for (int j = 0; j < listaClientes[i].cuentasAsociadas.length; j++) {
                    if (listaClientes[i].cuentasAsociadas[j] != null) {
                        listaClientes[i].cuentasAsociadas[j].ImprimirCuenta();
                    }
                }
            }
        }
        
        int cuiClienteDebito = 1258;
        int cuiClienteAcreditar = 1025;
        
        double montoTransferencia = 50.25;
        
        int cuentaDebito = 2;
        int cuentaAcreditar = 1;
        
        //PARA ACREDITAR
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null) {
                if (listaClientes[i].cui == cuiClienteAcreditar) {                    
                    for (int j = 0; j < listaClientes[i].cuentasAsociadas.length; j++) {
                        if (listaClientes[i].cuentasAsociadas[j] != null) {
                            if (listaClientes[i].cuentasAsociadas[j].id == cuentaAcreditar) {
                                listaClientes[i].cuentasAsociadas[j].saldo += montoTransferencia;
                            }
                        }
                    }
                }
            }
        }
        
        //PARA DEBITAR
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null) {
                if (listaClientes[i].cui == cuiClienteDebito) {
                    for (int j = 0; j < listaClientes[i].cuentasAsociadas.length; j++) {
                        if (listaClientes[i].cuentasAsociadas[j] != null) {
                            if (listaClientes[i].cuentasAsociadas[j].id == cuentaDebito) {
                                listaClientes[i].cuentasAsociadas[j].saldo -= montoTransferencia;
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null) {
                for (int j = 0; j < listaClientes[i].cuentasAsociadas.length; j++) {
                    if (listaClientes[i].cuentasAsociadas[j] != null) {
                        listaClientes[i].cuentasAsociadas[j].ImprimirCuenta();
                    }
                }
            }
        }
        
            
            
        
        /*
        for (int i = 0; i < listaClientes[1].cuentasAsociadas.length; i++) {
            if (listaClientes[1].cuentasAsociadas[i] != null) {
                listaClientes[1].cuentasAsociadas[i].ImprimirCuenta();
            }
        }*/

 /*
        System.out.println("Ingrese el numero a realizar el Factorial: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        int resultadoFactorial = Factorial(numero);
        System.out.println("Resultado del Factorial [" + numero + "]: " + resultadoFactorial);*/
    }

    public static int Factorial(int numero) {
        int resultado;

        if (numero == 0) {
            resultado = 1;
            System.out.println("Resultado [" + numero + "] : " + resultado);
        } else {
            resultado = numero * Factorial(numero - 1);
            System.out.println("Resultado [" + numero + "] : " + resultado);
        }

        return resultado;
    }

}
