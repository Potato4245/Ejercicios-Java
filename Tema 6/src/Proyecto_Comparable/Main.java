/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_Comparable;

/**
 *
 * @author MEDAC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos",18);
        Persona p2 = new Persona("Carlos",20);
        
        System.out.println(p1.equals(p2)); // en la teoria, estos dos objetos son iguales pero al compararlo nos pone que no lo son
        
        
        // para hacer esto bien, hay una interfaz ya creada
        System.out.println(p1.compareTo(p2));
        
        
    }
    
}
