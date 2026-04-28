/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Robots_barrer_y_fregar_mega_repaso;

/**
 *
 * @author MEDAC
 */
public abstract class Robot {
    protected int bateria;
    protected char letra;
    protected String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    abstract void ejecutar(char[][]habitacion);
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" | Bateria restante: "+bateria);
    }
    
    
}
