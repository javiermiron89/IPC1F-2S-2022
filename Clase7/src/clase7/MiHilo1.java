/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class MiHilo1 extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("FIN HILO 1");
    }
}
