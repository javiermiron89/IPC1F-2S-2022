/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class VehiculoPickup extends Vehiculo {
    
    private int capacidad;

    public VehiculoPickup(String placa, String marca, String modelo, int capacidad) {
        super(placa, marca, modelo);
        this.capacidad = capacidad;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String mostrarDatos() {
        String cadena = "Placa: " + this.placa +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo +
                "\nCapacidad: " + this.capacidad;
        return cadena;
    }
    
}
