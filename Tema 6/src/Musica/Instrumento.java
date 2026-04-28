/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author MEDAC
 */
public abstract class Instrumento {
    protected String nombre;
    protected String tipoFamilia;
    
    public Instrumento (String nombre, String tipoFamilia){
        this.nombre = nombre;
        this.tipoFamilia = tipoFamilia;
    }
    
    public abstract void afinar();
    
    public abstract void tocar();
    
    public void limpiar(){
        System.out.println("Limpiando instrumento");
    }
    
    
    
    
}
