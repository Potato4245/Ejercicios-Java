/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repasillo_Cartas;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Jugador {
    
    protected String nombre;
    
    Carta [] baraja = new Carta[40];
    
    Jugador(String nombre){
        this.nombre = nombre;
        rellenar(baraja);
    }

    private void rellenar(Carta[] baraja) {
        for (int i = 0; i < 10; i++) {
            baraja[i] = new Carta("ORO",i+1);
        }
        
        for (int i = 0; i < 10; i++) {
            baraja[i+10] = new Carta("BASTOS",i+1);
        }
        
        for (int i = 0; i < 10; i++) {
            baraja[i+20] = new Carta("ESPADAS",i+1);
        }
        
        for (int i = 0; i < 10; i++) {
            baraja[i+30] = new Carta("COPAS",i+1);
        }
    }

    @Override
    public String toString() {
        String respuesta = nombre;
        respuesta = respuesta + Arrays.toString(baraja);
        return respuesta;
    }
    
    
    
    
    
    
    
}
