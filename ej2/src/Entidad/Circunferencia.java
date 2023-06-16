/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Circunferencia {
    private double radio;
    
    //constructor

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(read.nextDouble());
        return c1;
    }
    
    public double area(){
        double area = 3.14 * (radio * radio);
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2*3.14*radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
}
