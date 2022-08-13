/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author javie
 */
public class Perro {

    //ATRIBUTOS
    private String raza;
    private String tamanio;
    private static int Anios;
    private String color;

    //CONSTRUCTOR
    public Perro(String raza, String tamanio, int Anios, String color) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.Anios = Anios;
        this.color = color;
    }

    //CONSTRUCTOR 2
    public Perro(String raza, String tamanio) {
        this.raza = raza;
        this.tamanio = tamanio;
    }

    //CONSTRUCTOR 3
    public Perro() {
        this.raza = "DEFAULT";
        this.tamanio = "DEFAULT";
        this.Anios = -1;
        this.color = "DEFAULT";
    }

    public void mostrarDatos() {
        System.out.println("Atributos del objeto Perro: ");
        System.out.println("Raza: " + this.getRaza());
        System.out.println("Tamanio: " + this.getTamanio());
        System.out.println("Anios: " + this.getAnios());
        System.out.println("Color: " + this.getColor());
    }

    public void Comer() {
        System.out.println("Hola, soy un " + this.raza + " de tamanio " + this.tamanio + ", y estoy moviendo la colita porque estoy comiendo");
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the Anios
     */
    public int getAnios() {
        return Anios;
    }

    /**
     * @param Anios the Anios to set
     */
    public void setAnios(int Anios) {
        this.Anios = Anios;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
