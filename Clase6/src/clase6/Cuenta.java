/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author javie
 */
public class Cuenta {
    
    public int id;
    public int dpiCliente;
    public double saldo;
    
    public Cuenta(int id, int dpiCliente, double saldo) {
        this.id = id;
        this.dpiCliente = dpiCliente;
        this.saldo = saldo;
    }
    
    public void ImprimirCuenta() {
        System.out.println("ID: " + id + ", DPI CLIENTE: " + dpiCliente + ", SALDO: " + saldo);
    }
    
}
