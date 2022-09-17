/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class VehiculoSedan extends Vehiculo {
    
    private int puertas;

    public VehiculoSedan(String placa, String marca, String modelo, int puertas) {
        super(placa, marca, modelo);
        this.puertas = puertas;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }
    
    @Override
    public String mostrarDatos() {
        String cadena = "Placa: " + this.placa +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo +
                "\nPuertas: " + this.puertas;
        return cadena;
    }
    
}
