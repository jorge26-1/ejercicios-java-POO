/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaireacondicionado;

/**
 *
 * @author SENA
 */
public class SistemaAireAcondicionado {
    private SensorTemperatura sensorTemperatura;
    private SensorHumedad sensorHumedad;
    private boolean aireEncendido;

    public SistemaAireAcondicionado() {
        this.sensorTemperatura = new SensorTemperatura();
        this.sensorHumedad = new SensorHumedad();
        this.aireEncendido = false;
    }

    
    public void controlarAireAcondicionado() {
        sensorTemperatura.leerTemperatura(); 
        sensorHumedad.leerHumedad(); 

        double temperatura = sensorTemperatura.obtenerTemperatura();
        double humedad = sensorHumedad.obtenerHumedad();

       
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            aireEncendido = true;
        } else {
            aireEncendido = false;
        }
    }

   
    public void mostrarEstado() {
        if (aireEncendido) {
            System.out.println("El aire acondicionado está ENCENDIDO.");
        } else {
            System.out.println("El aire acondicionado está APAGADO.");
        }
    }
}
