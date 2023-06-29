/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     * 
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = read.nextInt();
        System.out.println("Ingrese mes");
        int mes = read.nextInt();
        System.out.println("Ingrese anio");
        int anio = read.nextInt();
        Calendar fecha = new GregorianCalendar(anio, mes, dia);
        Calendar fechaActual = new GregorianCalendar();
        int anioFecha = fecha.get(Calendar.YEAR);
        int anioActual = fechaActual.get(Calendar.YEAR);
        System.out.println(fechaActual.get(Calendar.YEAR));
        System.out.println(anioActual-anioFecha);
    }
    
}
