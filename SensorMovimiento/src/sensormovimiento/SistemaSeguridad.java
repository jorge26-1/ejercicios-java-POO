/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensormovimiento;

/**
 *
 * @author SENA
 */
public class SistemaSeguridad {
    private SensorMovimiento sensor1;
    private SensorMovimiento sensor2;
    private SensorMovimiento sensor3;
    private boolean alarmaActivada;
    private boolean esDeNoche;

    public SistemaSeguridad() {
        sensor1 = new SensorMovimiento();
        sensor2 = new SensorMovimiento();
        sensor3 = new SensorMovimiento();
        alarmaActivada = false;
        esDeNoche = false; 
    }

    
    public void leerSensores() {
        
        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();
        sensor3.detectarMovimiento();

        
        int sensoresActivos = 0;
        if (sensor1.getDetectaMovimiento()) sensoresActivos++;
        if (sensor2.getDetectaMovimiento()) sensoresActivos++;
        if (sensor3.getDetectaMovimiento()) sensoresActivos++;

        if (sensoresActivos >= 2 && esDeNoche) {
            alarmaActivada = true;
        } else {
            alarmaActivada = false;
        }
    }

    
    public void cambiarEstadoAlarma() {
        alarmaActivada = !alarmaActivada;
    }

    
    public void mostrarEstado() {
        if (alarmaActivada) {
            System.out.println("¡Alarma activada! Intruso detectado.");
        } else {
            System.out.println("Alarma desactivada.");
        }
    }

    
    public void cambiarHora(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
}
