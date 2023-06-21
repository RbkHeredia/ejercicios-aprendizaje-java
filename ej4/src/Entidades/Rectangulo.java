/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Rectangulo {
    //atributos 
    private int base;
    private int altura;
    
    //constructor vacio
    public Rectangulo() {
    }
    
    //constructor completo
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Rectangulo crearRectangulo(){
        Rectangulo r1 = new Rectangulo();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(read.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(read.nextInt());
        return r1;
    }
    
    public int superficie(){
        return base * altura;
    }
    
    public int perimetro(){
        return (base + altura)*2;
    }
    
    public void dibujo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
