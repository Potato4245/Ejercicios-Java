/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author MEDAC
 */
public class Guitarra extends Instrumento {

    public Guitarra(String nombre, String tipoFamilia) {
        super(nombre, tipoFamilia);
    }

    @Override
    public void afinar() {
        System.out.println("Seis cuerdas afinando");
    }

    @Override
    public void tocar() {
        System.out.println("Ragueo");
    }
    
}
