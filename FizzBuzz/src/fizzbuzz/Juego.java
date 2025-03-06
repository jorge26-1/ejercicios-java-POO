/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author SENA
 */
public class Juego {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(); 
        Menu menu = new Menu(fizzBuzz); 
        menu.mostrarMenu(); 
    }
}

