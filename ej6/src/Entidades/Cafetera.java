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
public class Cafetera {
    private double capacidadMax;
    private double cantidadActual;
    
    
    //constructores

    public Cafetera() {
    }

    public Cafetera(double capacidadMax, double cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public Cafetera crearCafetera(){
        Cafetera c1 = new Cafetera();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la capacidad de la cafetera");
        c1.setCapacidadMax(read.nextDouble());
        c1.setCantidadActual(0);
        return c1;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMax;
        System.out.println("Cafetera llena");
    }
    
    public void servirTaza(double taza){
        if(taza < cantidadActual){
            cantidadActual -= taza;
            System.out.println("Taza llena. la cafetera todavia tiene "+cantidadActual);
                 
        } else {
            cantidadActual = 0;
            System.out.println("Faltan "+ (cantidadActual-taza));
        }
    }
    
    public void vaciarTaza(){
        cantidadActual = 0;
        System.out.println("Cafetera vaciada");
    }
    
    public void agregarCafe(double cafe){
        if(cantidadActual + cafe > capacidadMax){
            cantidadActual = capacidadMax;
            System.out.println("Se ha llenado la cafetera al maximo");
        } else {
            cantidadActual += cafe;
            System.out.println("Llenada correctamente");
        }
    }
}
