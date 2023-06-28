/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import Entidades.Matematica;
import Servicios.ServicioMatematica;

/**
 *
 * @author rebek
 * 
 * * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = (int) (Math.random()*25);
        int n2 = (int) (Math.random()*25);
        System.out.println("N1: " +n1 +" \n N2: "+ n2);
        ServicioMatematica sm = new ServicioMatematica();
        Matematica m1 = sm.newMath(n1, n2);
        System.out.println("El mayor numero es: "+ sm.devolverMayor(m1));
        System.out.println("El mayor numero elevado al menor es: " + sm.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor numero es: " + sm.calcularRaiz(m1));
    }
    
}
