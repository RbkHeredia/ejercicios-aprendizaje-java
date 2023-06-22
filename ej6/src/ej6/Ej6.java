/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import Entidades.Cafetera;

/**
 *
 * @author rebek
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera().crearCafetera();
        c1.llenarCafetera();
        c1.servirTaza(120);
        c1.agregarCafe(300);
    }
    
}
