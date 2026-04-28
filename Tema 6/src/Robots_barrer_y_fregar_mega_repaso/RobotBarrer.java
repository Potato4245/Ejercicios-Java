/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Robots_barrer_y_fregar_mega_repaso;

/**
 *
 * @author MEDAC
 */
public class RobotBarrer extends Robot{

    public RobotBarrer(String nombre) {
        super(nombre);
        bateria = 20;
        letra = 'B';
    }
    
    @Override
    void ejecutar(char[][] habitacion) {
        for (int i = 0; i < habitacion.length; i++) {
            for (int j = 0; j < habitacion[i].length; j++) {
                if(bateria > 0){
                    habitacion[i][j] = letra;
                    bateria--;
                }else{
                    i = habitacion.length;
                    j = habitacion.length;
                }
                    
            }
        }
    }
    
}
