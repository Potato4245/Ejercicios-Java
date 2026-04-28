/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Abstracta;

/**
 *
 * @author MEDAC
 */
public abstract class Animal {
    protected int patas;

    
    public Animal (int patas){
        this.patas = patas;
    }
    
    public void dormir(){
        System.out.println("zzzzz");
    }
    
    public abstract void comer();

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Animal{" + "patas=" + patas + '}';
    }

    
    
    
}
