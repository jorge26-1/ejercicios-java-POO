/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaluces;

/**
 *
 * @author SENA
 */
import java.util.Random;

public class SensorMovimiento {
    private boolean hayMovimiento;

    public SensorMovimiento() {
        this.hayMovimiento = false;
    }

    
    public void detectarMovimiento() {
        Random random = new Random();
        this.hayMovimiento = random.nextBoolean();  
    }

    public boolean detectar() {
        return this.hayMovimiento;
    }

    
    public void resetear() {
        this.hayMovimiento = false;
    }
}
