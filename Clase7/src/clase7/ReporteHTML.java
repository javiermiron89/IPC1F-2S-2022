/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author javie
 */
public class ReporteHTML {
    
    public static void main(String[] args) {
        
        Vehiculo[] listaVehiculos = new Vehiculo[4];
        
        listaVehiculos[0] = new Vehiculo("P-123ABC", "Marca", "Modelo");
        listaVehiculos[1] = new VehiculoSedan("P-823PNQ", "Toyota", "2020", 4);
        listaVehiculos[2] = new VehiculoDeportivo("P-133HUM", "Ferrari", "2024", 360);
        listaVehiculos[3] = new VehiculoPickup("P-436UBE", "Nissan", "2022", 1000);
        
        String cadenaHTML = "<!DOCTYPE html>\n"
                + "<html lang=\"en\"> \n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\">\n"
                + "     <title>Reporte</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<table>\n"
                + "     <tr>\n"
                + "          <th>Placa</th>\n"
                + "          <th>Marca</th>\n"
                + "      </tr>\n"
                ;
        
        for (Vehiculo carro : listaVehiculos) {
            if (carro != null) {
                cadenaHTML += "     <tr>"
                        + "          <th>" + carro.getPlaca() + "</th>"
                        + "          <th>" + carro.getMarca() + "</th>"
                        + "     </tr>";
            }
        }
        
        cadenaHTML += """
                      </table>
                      </head>
                      <body>
                      """;
        
        
        File archivo = new File("reporte.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(cadenaHTML);
            bw.close();
        } catch (Exception e) {
        }
        
    }
}
