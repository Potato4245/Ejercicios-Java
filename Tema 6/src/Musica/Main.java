/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Musica;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Instrumento [] orquesta = new Instrumento [5];
        
        rellenar(orquesta);
        for (int i = 0; i < orquesta.length; i++) {
            orquesta[i].afinar();
            orquesta[i].tocar();
        }
        
        
        
        
    }

    private static void rellenar(Instrumento[] orquesta) {
        int respuesta;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < orquesta.length; i++) {
            System.out.println("1. Guitarra   2. Piano");
            respuesta = sc.nextInt();
            if(respuesta == 1){
                orquesta[i] = new Guitarra("Guitar","Cuerda");
            }
            else{
                orquesta[i] = new Piano("Pianito","Cuerda Percutida");
            }
        }
    }
    
}
