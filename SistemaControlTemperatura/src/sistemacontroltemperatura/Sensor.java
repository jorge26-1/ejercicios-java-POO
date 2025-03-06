/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontroltemperatura;

/**
 *
 * @author SENA
 */
import java.util.Random;

public class Sensor {

    
    public double leerTemperatura() {
        Random random = new Random();
        
        return 5 + (random.nextDouble() * 35);
    }
}

