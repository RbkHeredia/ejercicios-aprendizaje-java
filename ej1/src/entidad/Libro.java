/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int pag;

    //constructor
    public Libro(int ISBN, String titulo, String autor, int pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    //constructor vacio
    public Libro() {
    }
    
    //getters

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPag() {
        return pag;
    }
    
    //setters

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }
    
    //nuevo libro
    
    public Libro nuevoLibro(){
        Libro l1 = new Libro();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero de ISBN");
        l1.setISBN(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(read.nextLine());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(read.nextLine());
        System.out.println("Ingrese la cantidad de paginas del libro");
        l1.setPag(read.nextInt());
        return l1;
    }
   
    
    //to String

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", pag=" + pag + '}';
    }
    
    
    

}
