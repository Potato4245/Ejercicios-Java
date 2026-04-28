/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public abstract class Vehiculo {
    protected int ruedas;
    
    Vehiculo(int ruedas){
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "ruedas=" + ruedas + '}';
    }
    
    
}
