/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public class Pajaro extends Animal implements Volar {

    public Pajaro(int patas) {
        super(patas);
    }

    @Override
    public void acelerar() {
        System.out.println("Pajaro acelerando");
    }

    @Override
    public void planear() {
        System.out.println("Pajaro planeando");
    }
    
}
