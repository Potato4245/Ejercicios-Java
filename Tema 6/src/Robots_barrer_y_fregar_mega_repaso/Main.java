/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Robots_barrer_y_fregar_mega_repaso;

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
        
        /*
        Dos robots, uno de fregar y otro de barrer
        Clase abstracta robot y dos herencias
        
        El robot fregar tiene 20 de bateria y gasta 2
        El robot barrer tiene 20 de bareria y gasta 1
        
        No se puede fregar si no se ha barrido antes
        
        Atributos robot principal: bateria, letra (char), nombre
        Metodos robot principal: ejecutar (es poner la f o la b)
        mostrar (dice el nombre y la bateria)
        
        
        Decir cuanto mide la habitacion y crear una matriz (los metros lo pone el usuario)
        
        El menu: 1. Barrer 2. Fregar 3. Mostrar tablero 4. Mostrar estado 5. Salir
        
        */
        
        // Variables
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        int resp;
        int metros;
        String nombre;
        String nombre1;
        boolean barrido = false;
        
        // Ejecucion
        
        
        System.out.println("Introduce los metros de la habitacion");
        metros = sc.nextInt();
        
        char [][] habitacion = new char [metros][metros];
        
        rellenar(habitacion);
        
        // creacion de robots
        System.out.println("Introduce el nombre del robot 1 (barrer)");
        nombre = sc.next();
        RobotBarrer r1 = new RobotBarrer(nombre);
        
        System.out.println("Introduce el nombre del robot 2 (fregar)");
        nombre1 = sc.next();
        RobotFregar r2 = new RobotFregar(nombre1);
        
        
        // menu
        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("1. Barrer   ");
            System.out.print("2. Fregar   ");
            System.out.print("3. Mostrar tablero   ");
            System.out.print("4. Mostrar estado   ");
            System.out.println("5. Salir");
            resp = sc.nextInt();
            
            switch(resp){
                case 1:
                    r1.ejecutar(habitacion);
                    barrido = true;
                    break;
                    
                    
                    
                case 2:
                    if(barrido == false){
                        System.out.println("Primero se barre y luego se friega!");
                        break;
                    }else{
                        r2.ejecutar(habitacion);
                    }
                    break;
                    
                    
                case 3:
                    mostrar(habitacion);
                    break;
                    
                    
                case 4:
                    r1.mostrar();
                    r2.mostrar();
                    break;
                    
                    
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                    
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(!salir);
        
        
    }

    private static void mostrar(char[][] habitacion) {
        for (int i = 0; i < habitacion.length; i++) {
            System.out.print("|");
            for (int j = 0; j < habitacion[i].length; j++) {
                System.out.print(habitacion[i][j]+"|");
            }
            System.out.println(" ");
            
        }
    }

    private static void rellenar(char[][] habitacion) {
        for (int i = 0; i < habitacion.length; i++) {
            for (int j = 0; j < habitacion[i].length; j++) {
                habitacion[i][j] = '-';
            }
        }
    }
    
}
