/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class productService {
    public Movil cargarCelular(){
        Scanner read = new Scanner(System.in);
        Movil m1 = new Movil();
        System.out.println("Agregar nuevo producto:");
        System.out.println("Marca:");
        m1.setMarca(read.nextLine());
        System.out.println("Precio:");
        m1.setPrecio(read.nextDouble());
        read.nextLine();
        System.out.println("Modelo:");
        m1.setModelo(read.nextLine());
        System.out.println("Memoria Ram");
        m1.setMemoriaRam(read.nextInt());
        read.nextLine();
        System.out.println("Almacenamiento:");
        m1.setAlmacenamiento(read.nextInt());
        read.nextLine();
        m1.setCodigo(ingresarCodigo());
        System.out.println("Ingresado con exito");
        return m1;
        
    }
    
    public String[] ingresarCodigo(){
        String[] codigo = new String[7];
        Scanner read = new Scanner(System.in);
        String code;
        do{
            System.out.println("Ingrese el codigo de 7 letras o numeros");
            code = read.nextLine();
        } while (code.length() != 7);
        char letra;
        for (int i = 0; i < 7; i++) {
            letra = code.charAt(i);
            codigo[i] = String.valueOf(letra);
        }
        
        return codigo;
    }
            
}
