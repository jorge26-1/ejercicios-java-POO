/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaaireacondicionado;

/**
 *
 * @author SENA
 */
public class MainAireAcondicionado {

    public static void main(String[] args) {
        
        SistemaAireAcondicionado sistemaAireAcondicionado = new SistemaAireAcondicionado();

        
        Menu menu = new Menu(sistemaAireAcondicionado);

       
        menu.mostrarMenu();
    }
}
