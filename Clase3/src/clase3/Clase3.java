/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

/**
 *
 * @author javie
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Mastin Napolitano", "Grande", 5, "Negro");
        Perro perro2 = new Perro("Maltes", "Pequenio");
        Perro perro3 = new Perro("Chow Chow", "Mediano", 3, "Marron");
        Perro perro4 = new Perro();
        
        //perro2.Comer();
        //perro1.mostrarDatos();
        perro2.mostrarDatos();
        //perro3.mostrarDatos();
        //perro4.mostrarDatos();
        
        int[] numeros = new int[10];
        Perro[] listaPerros = new Perro[4];
        listaPerros[0] = new Perro("IPC", "SDFAS DF", 58, "ASDFSADF");
        listaPerros[1] = perro2;
        listaPerros[2] = perro3;
        listaPerros[3] = perro4;
        
        for (int i = 0; i < listaPerros.length; i++) {
            if (listaPerros[i].getAnios() == 3) {
                //System.out.println("SI SOY");
            }
            //listaPerros[i].Comer();
        }
    }
    
}
