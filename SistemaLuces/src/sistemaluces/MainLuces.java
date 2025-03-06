/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaluces;

/**
 *
 * @author SENA
 */
public class MainLuces {

    public static void main(String[] args) {
        
        SistemaLuces sistemaLuces = new SistemaLuces();

        
        Menu menu = new Menu(sistemaLuces);

        
        menu.mostrarMenu();
    }
}
