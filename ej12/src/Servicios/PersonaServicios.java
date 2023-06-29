/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * https://es.stackoverflow.com/questions/13777/obtener-edad-a-partir-de-la-fecha-de-nacimiento-en-java
 */
public class PersonaServicios {
    public Persona crearPersona() {
        Persona p1 = new Persona();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        p1.setNombre(read.nextLine());
        System.out.println("Ingrese el dia de nacimiento");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = read.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = read.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        p1.setFechaNacimiento(fecha);
        return p1;
    }
    
    public int calcularEdad(Persona p1) {
        LocalDate fecha = p1.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fecha, fechaActual).getYears();
    }
    
    public boolean menorQue(Persona p1, int edad){
        int edad1 = calcularEdad(p1);
        return edad1 < edad;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString());
    }
}
