/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Comparable;

/**
 *
 * @author MEDAC
 */
public class Persona implements Comparable<Persona> { // la interface Comparable es para comparar objetos
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona o) {
        if(nombre == o.nombre && edad == o.edad){
            return 1;
        }else{
            return 0;
        }
    }

    
    
    
    
    
}
