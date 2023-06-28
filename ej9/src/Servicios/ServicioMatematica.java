/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author rebek
 */
public class ServicioMatematica {
    public Matematica newMath(int num1, int num2){
        Matematica m1 = new Matematica();
        m1.setNum1(num1);
        m1.setNum2(num2);
        return m1;
    }
    
    public int devolverMayor(Matematica m1) {
        if(m1.getNum1()>m1.getNum2()){
            return m1.getNum1();
        } else {
            return m1.getNum2();
        }
    }
    
    public int calcularPotencia(Matematica m1){
        if(m1.getNum1()>m1.getNum2()){
            return (int) Math.pow(m1.getNum2(), m1.getNum1());
        } else {
            return  (int) Math.pow(m1.getNum1(), m1.getNum2());
        }
    }
    
    public int calcularRaiz(Matematica m1) {
        int menor;
        if(m1.getNum1()>m1.getNum2()){
            menor = m1.getNum2();
        } else {
            menor = m1.getNum1();
        }
        menor = Math.abs(menor);
        return (int) Math.sqrt(menor);
    }
}
