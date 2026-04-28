/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Interface;

/**
 *
 * @author MEDAC
 */
public abstract class Animal {
    protected int patas;
    
    Animal(int patas){
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Animal{" + "patas=" + patas + '}';
    }
    
    
    
    
    
}
