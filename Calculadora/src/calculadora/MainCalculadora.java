/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */
public class MainCalculadora {

    public static void main(String[] args) {
       
        Calculadora calculadora = new Calculadora();

        
        Menu menu = new Menu(calculadora);
        menu.mostrarMenu();
    }
}
