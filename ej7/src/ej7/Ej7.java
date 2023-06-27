/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import entidades.Persona;
import servicios.personaServicios;

/**
 *
 * @author rebek
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaServicios ps = new personaServicios();
        int[] imcp = new int[4];
        boolean[] mayor = new boolean[4];
        Persona p1 = ps.crearPersona();
        imcp[0] = ps.calcularIMC(p1);
        mayor[0] = ps.esMayorDeEdad(p1);
        
        Persona p2 = ps.crearPersona();
        imcp[1] = ps.calcularIMC(p2);
        mayor[1] = ps.esMayorDeEdad(p2);
        
        Persona p3 = ps.crearPersona();
        imcp[2] = ps.calcularIMC(p3);
        mayor[2] = ps.esMayorDeEdad(p3);
        
        Persona p4 = ps.crearPersona();
        imcp[3] = ps.calcularIMC(p4);
        mayor[3] = ps.esMayorDeEdad(p4);
        System.out.println(imcp[3]);
        int lower = 0;
        int medium = 0;
        int greater = 0;
        for (int i = 0; i < 4; i++) {
            if(imcp[i] == -1){
                lower +=25;
            } else if(imcp[i] == 0){
                medium +=25;
            } else {
                greater +=25;
            }
        }
       
        System.out.println(lower);
        System.out.println("Bajo peso: %" + lower) ;
        System.out.println("Peso correcto: %" +medium);
        System.out.println("Sobrepeso: %" + greater);
        int porcMay = 0;
        for (int i = 0; i < 4; i++) {
            if(mayor[i]){
                porcMay+=25;
            }
        }
        
        System.out.println("Mayores de edad: %"+ porcMay);
        System.out.println("Menores de edad: %"+ (100-porcMay));
    }
    
}
