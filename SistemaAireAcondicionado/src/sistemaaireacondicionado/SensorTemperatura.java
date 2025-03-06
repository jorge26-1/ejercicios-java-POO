/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaaireacondicionado;

/**
 *
 * @author SENA
 */
import java.util.Random;

public class SensorTemperatura {
    private double temperatura;

    public SensorTemperatura() {
        this.temperatura = 20.0; 
    }

    
    public void leerTemperatura() {
        Random random = new Random();
        this.temperatura = 20 + random.nextDouble() * 15; 
    }

    public double obtenerTemperatura() {
        return this.temperatura;
    }
}
