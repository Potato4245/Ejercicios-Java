/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public class Avion extends Vehiculo implements Volar{

    public Avion(int ruedas) {
        super(ruedas);
    }

    @Override
    public void acelerar() {
        System.out.println("Avion acelerando");
    }

    @Override
    public void planear() {
        System.out.println("Avion planeando");
    }
    
}
