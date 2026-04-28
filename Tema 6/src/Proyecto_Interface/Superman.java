/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public class Superman extends Superheroe implements Volar,hacerRuido{

    public Superman(String nombre, int fuerza) {
        super(nombre, fuerza);
    }

    
    
    @Override
    public void acelerar() {
        System.out.println("Superman acelerando");
    }

    @Override
    public void planear() {
        System.out.println("Superman planea bien");
    }

    @Override
    public void generarRuido() {
        System.out.println("Superman no grites");
    }
    
}
