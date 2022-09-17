/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class VehiculoDeportivo extends Vehiculo {
    
    private int velocidadMaxima;
    
    public VehiculoDeportivo(String placa, String marca, String modelo, int velocidadMaxima) {
        super(placa, marca, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    @Override
    public String mostrarDatos() {
        String cadena = "Placa: " + this.placa +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo +
                "\nVelocidad MAX: " + this.velocidadMaxima;
        return cadena;
    }
    
}
