/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class MainHilos {
    
    public static void main(String[] args) throws InterruptedException {
        //FORMA 1
        MiHilo1 hilo1 = new MiHilo1();
        
        //FORMA 2
        MiHilo2 ejecutar = new MiHilo2();
        Thread hilo2 = new Thread(ejecutar);
        
        hilo1.start();
        hilo1.join();
        hilo2.start();
    }
    
}
