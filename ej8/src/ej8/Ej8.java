/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author rebek
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 * 
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CadenaServicios cs = new CadenaServicios();
        System.out.println("Ingresa una palabra o frase");
        String frase = read.nextLine();
        Cadena c1 = cs.newCadena(frase);
        System.out.println("cant de vocales: " + cs.cantVocales(c1));
        System.out.println("Al reves: " + cs.invertirFrase(c1));
        System.out.println("Ingrese una letra a contar en la frase");
        String caracter = read.nextLine();
        System.out.println("El caracter " + caracter + " se repite: " +cs.vecesRepetido(c1, caracter));
        System.out.println("Ingresa una palabra o frase");
        String frase2 = read.nextLine();
        Cadena c2 = cs.newCadena(frase2);
        cs.compararLong(c1, c2);
        String unir = cs.unirFrase(c1, c2);
        System.out.println(unir);
        System.out.println("Vamos a reemplazar la letra 'a' por otro caracter, ingresalo: ");
        System.out.println(cs.reemplazar(c1, read.nextLine()));
        System.out.println("Ingresa una letra para saber si existe en la frase ingresada");
        System.out.println(cs.contiene(c1, read.nextLine()));
    }
    
}
