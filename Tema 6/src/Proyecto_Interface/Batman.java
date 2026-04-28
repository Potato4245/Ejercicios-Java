/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public class Batman extends Superheroe implements Volar{

    public Batman(String nombre, int fuerza) {
        super(nombre, fuerza);
    }

    @Override
    public void acelerar() {
        System.out.println("Batman acelerando");
    }

    @Override
    public void planear() {
        System.out.println("Batman planeando");
    }
    
}
