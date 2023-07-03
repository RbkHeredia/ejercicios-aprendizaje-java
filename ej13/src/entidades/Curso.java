/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rebek
 */
public class Curso {
    private String nombreCurso;
    private int cantHorasPorDia;
    private int cantDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasPorDia, int cantDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantDiasPorSemana = cantDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(int cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public int getCantDiasPorSemana() {
        return cantDiasPorSemana;
    }

    public void setCantDiasPorSemana(int cantHorasPorSemana) {
        this.cantDiasPorSemana = cantHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
