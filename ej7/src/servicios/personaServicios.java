/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author rebek
 * Scanner input= new Scanner(System.in, "utf-8");
 * Scanner consola = new Scanner(System.in, "Windows-1252);
 */
public class personaServicios {
    public Persona crearPersona(){
        Scanner read= new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("Ingrese los siguientes datos: Nombre");
        p1.setNombre(read.nextLine());
        System.out.println("Edad:");
        p1.setEdad(read.nextInt());
        read.nextLine();
        String sex;
        do{
            System.out.println("Sexo (H Hombre, M Mujer, O Otro)");
            sex = read.nextLine();
        } while (!sex.equals("M") && !sex.equals("H") && !sex.equals("O"));
        p1.setSexo(sex.charAt(0));
        System.out.println("Peso:");
        p1.setPeso(read.nextDouble());
        System.out.println("Altura:");
        p1.setAltura(read.nextDouble());
        System.out.println("Datos cargados correctamente");
        return p1;
    }
    
    public int calcularIMC(Persona p1){
        //(peso enkg/(altura^2 en mt2)).
        double imc = p1.getPeso()/Math.pow(p1.getAltura(), 2);
        int result = (int) (imc);
        System.out.println("El imc es: " + result);
        if(result < 20){
            return -1;
        } else if(result <=25){
            return 0;
        } else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1){
        boolean result = p1.getEdad()>18;
        return result;
    }
}
