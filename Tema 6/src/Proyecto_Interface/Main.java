/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Superheroe sp = new Superheroe("test",5); No se puede crear un objeto de una clase abstracta
        
        
        Superman s1 = new Superman("Clark",10);
        
        Pajaro p1 = new Pajaro(2);
        
        Avion a1 = new Avion(12);
        
        Batman b1 = new Batman("Bruce",8);
        
        Superheroe [] array = {s1,b1};
        
        
        s1.acelerar();
        s1.generarRuido();
        s1.planear();
        s1.pruebaVelocidad();
        
        p1.acelerar();
        p1.planear();
        
        a1.acelerar();
        a1.planear();
        
        // El metodo instance of sirve para sacar el tipo de la clase, sirve para hacer operaciones.
        
        
        
        
        
        
    }
    
}
