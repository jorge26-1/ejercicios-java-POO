/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author SENA
 */

    
public class MainCine {
    public static void main(String[] args) {
        
        Sala sala = new Sala("Sala 1", 10);
        
        Cine cine = new Cine(sala);
        
        Persona persona = new Persona("Juan Pérez");
        Usuario usuario = new Usuario(persona);
        
        Menu menu = new Menu(cine, usuario);

        
        menu.mostrarMenu();
    }
}
