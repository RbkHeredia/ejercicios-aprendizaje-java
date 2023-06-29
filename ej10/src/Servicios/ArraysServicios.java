/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Array;
import java.util.Arrays;

/**
 *
 * @author rebek
 */
public class ArraysServicios {
    public Array llenarArrayA() {
        Array a1 = new Array();
        int[] array = new int[50];
        System.out.println("Array 1");
        for (int i = 0; i < 50; i++) {
            array[i] =  (int) (Math.random()*20);
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
        a1.setArregloA(array);
        return a1;
    }
    
    public Array llenarArrayB(Array a1) {
        Array a2 = new Array();
        int[] array = new int[20];
        System.out.println("Array 2");
        int[] arrayOr = a1.getArregloA();
        Arrays.sort(arrayOr);
        for (int i = 0; i < 20; i++) {
            if(i<10){
                array[i] = arrayOr[i];
            } else {
                array[i] = 5;
            }
            System.out.print("["+array[i]+"]");
        }
        a2.setArregloB(array);
        return a2;
    }
}
