/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public abstract class Superheroe {
    protected String nombre;
    protected int fuerza;
    
    Superheroe(String nombre, int fuerza){
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Superheroe{" + "nombre=" + nombre + ", fuerza=" + fuerza + '}';
    }
    
    
}
