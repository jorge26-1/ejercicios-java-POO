/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensormovimiento;

/**
 *
 * @author SENA
 */
import java.util.Random;

public class SensorMovimiento {
    private boolean detectaMovimiento;

    public SensorMovimiento() {
        this.detectaMovimiento = false; 
    }

    
    public void detectarMovimiento() {
        Random random = new Random();
        
        this.detectaMovimiento = random.nextBoolean();
    }

    
    public boolean getDetectaMovimiento() {
        return detectaMovimiento;
    }

    
    public void resetearSensor() {
        this.detectaMovimiento = false;
    }
}

