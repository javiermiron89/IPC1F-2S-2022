/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] listaVehiculos = new Vehiculo[4];
        
        listaVehiculos[0] = new Vehiculo("P-123ABC", "Marca", "Modelo");
        listaVehiculos[1] = new VehiculoSedan("P-823PNQ", "Toyota", "2020", 4);
        listaVehiculos[2] = new VehiculoDeportivo("P-133HUM", "Ferrari", "2024", 360);
        listaVehiculos[3] = new VehiculoPickup("P-436UBE", "Nissan", "2022", 1000);
        
        for (Vehiculo carro : listaVehiculos) {
            if (carro instanceof VehiculoSedan) {
                System.out.println("Yo soy el carro sedan");
            }
            System.out.println("Carro: ");
            System.out.println(carro.mostrarDatos() + "\n");
        }
        
    }
    
}
