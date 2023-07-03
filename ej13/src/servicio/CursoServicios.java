/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class CursoServicios {
    public String[] cargarAlumnos(){
        Scanner read = new Scanner(System.in);
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno:");
            alumnos[i] = read.nextLine();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
        Scanner read = new Scanner(System.in);
        Curso c1 = new Curso();
        System.out.println("Vamos a crear el curso");
        System.out.println("Ingresa el nombre del curso");
        c1.setNombreCurso(read.nextLine());
        System.out.println("Cantidad de horas por dia:");
        c1.setCantHorasPorDia(read.nextInt());
        read.nextLine();
        System.out.println("Cantidad de dias por semana:");
        c1.setCantDiasPorSemana(read.nextInt());
        read.nextLine();
        String turno;
        do {
            System.out.println("turno: tarde o manana");
            turno = read.nextLine();
        } while (!turno.equals("tarde") && !turno.equals("manana"));
        c1.setTurno(turno);
        System.out.println("precio por hora:");
        c1.setPrecioPorHora(read.nextDouble());
        c1.setAlumnos(cargarAlumnos());
        return c1;
    }
    
    public double calcularGananciaSemanal(Curso c1){
        double total = c1.getCantHorasPorDia() * c1.getPrecioPorHora() * 5 *c1.getCantDiasPorSemana();
        return total;
    }
    
}
