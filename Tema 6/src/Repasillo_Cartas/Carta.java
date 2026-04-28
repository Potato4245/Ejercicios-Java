/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repasillo_Cartas;

/**
 *
 * @author MEDAC
 */
public class Carta {
    // Atributos
    
    protected String palo;
    protected int valor;
    
    Carta(String palo, int valor){
        this.valor = valor;
        this.palo = palo;
    }
    
    // del 1 al 7 y luego sota caballo rey
    // bastos, oro, espadas, copas

    @Override
    public String toString() {
        String texto;
        if(valor == 8){
            texto = "Sota";
            return "  Palo: " + palo + "  Valor: " + texto;
        }else if(valor == 9){
            texto = "Caballo";
            return "  Palo: " + palo + "  Valor: " + texto;
        }else if(valor == 10){
            texto = "Rey";
            return "  Palo: " + palo + "  Valor: " + texto;
        }
        return "  Palo: " + palo + "  Valor: " + valor;
    }
    
    
    
    
    
}
