/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public interface Volar {
    int gravedad = 8; // si no se le pone nada, se hace public static y final de forma automatica
    
    void acelerar(); // si no se le pone nada, se hace public static y final de forma automatica
    
    public abstract void planear();
    
    default void pruebaVelocidad(){
        System.out.println("Probando velocidad");
    }
    
    
    
}
