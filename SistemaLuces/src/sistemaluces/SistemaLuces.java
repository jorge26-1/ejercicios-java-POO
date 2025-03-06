/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaluces;

/**
 *
 * @author SENA
 */
public class SistemaLuces {
    private boolean esDeNoche;
    private SensorMovimiento sensorMovimiento;
    private boolean lucesEncendidas;

    public SistemaLuces() {
        this.esDeNoche = false;  
        this.sensorMovimiento = new SensorMovimiento();
        this.lucesEncendidas = false;
    }

   
    public void controlarLuces() {
        sensorMovimiento.detectarMovimiento();  

        
        if (esDeNoche && sensorMovimiento.detectar()) {
            lucesEncendidas = true;
        } else {
            
            lucesEncendidas = false;
        }
    }

    
    public void cambiarHora(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    
    public void mostrarEstado() {
        if (lucesEncendidas) {
            System.out.println("Las luces están ENCENDIDAS.");
        } else {
            System.out.println("Las luces están APAGADAS.");
        }
    }
}
