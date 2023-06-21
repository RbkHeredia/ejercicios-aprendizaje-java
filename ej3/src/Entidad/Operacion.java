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
public class Operacion {
    //atributos privados
    private int num1;
    private int num2;
    
    //constructor con todos los atributos

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //constructor sin los atributos

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        op.setNum1(read.nextInt());
        System.out.println("Ingrese el segundo valor");
        op.setNum2(read.nextInt());
        return op;
    }
    
    public int suma(){
        return num1 +num2;
    }
    
    public int restar(){
        return num1 -num2;
    }
    
    public int multiplicar(){
        if(num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 * num2;
        }
    }
    
    public double dividir(){
        if(num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }
        
}
