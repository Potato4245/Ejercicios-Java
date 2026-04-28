/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author MEDAC
 */
public class Piano extends Instrumento {

    public Piano(String nombre, String tipoFamilia) {
        super(nombre, tipoFamilia);
    }

    @Override
    public void afinar() {
        System.out.println("Llama al tecnico de piano");
    }

    @Override
    public void tocar() {
        System.out.println("Armonia de teclas");
    }
    
}
