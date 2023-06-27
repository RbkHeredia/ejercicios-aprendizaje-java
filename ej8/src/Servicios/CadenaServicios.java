/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author rebek
 */
public class CadenaServicios {
    public Cadena newCadena(String frase){
        Cadena c1 = new Cadena();
        c1.setFrase(frase);
        return c1;
    }
    
    public int cantVocales( Cadena c1){
        int lg = c1.getLongitud();
        String frase = c1.getFrase();
        char letter;
        int counter = 0;
        String[] vocales = { "a", "e", "i", "o", "u" };
        for (int i = 0; i < lg; i++) {
            for (int j = 0; j < 5; j++) {
                letter = frase.charAt(i);
                if(Character.toString(letter).equals(vocales[j])){
                    counter++;
                }
            }
        }
        return counter;
    }
    
    public String invertirFrase( Cadena c1){
        int lg = c1.getLongitud();
        String frase = c1.getFrase();
        char letter;
        String newFrase = "";
        for (int i = lg-1; i >= 0; i--) {
            letter = frase.charAt(i);
            newFrase = newFrase + Character.toString(letter);
        }
        return newFrase;
    }
    
    public int vecesRepetido(Cadena c1, String letter){
        int counter=0;
        int lg = c1.getLongitud();
        String frase = c1.getFrase();
        char letra;
        for (int i = 0; i < lg; i++) {
            letra = frase.charAt(i);
            if(Character.toString(letra).equals(letter)){
                counter++;
            }
        }
        return counter;
    }
    
    public void compararLong(Cadena c1, Cadena c2){
        if(c1.getLongitud()<c2.getLongitud()){
            System.out.println("La primer frase es menor que la segunda");
        } else if (c1.getLongitud()==c2.getLongitud()){
            System.out.println("Las 2 frases tienen la misma cantidad de caracteres");
        } else {
            System.out.println("La primer frase tiene mas caracteres que la segunda");
        }
    }
    
    public String unirFrase(Cadena c1, Cadena c2){
        String frase = c1.getFrase().concat(" ").concat(c2.getFrase());
        return frase;
    }
    
    public String reemplazar(Cadena c1, String letra){
        String newFrase = "";
        int lg = c1.getLongitud();
        String frase = c1.getFrase();
        char letter;
        for (int i = 0; i < lg; i++) {
            letter = frase.charAt(i);
            if(Character.toString(letter).equals("a")){
                newFrase += letra;
            } else {
                newFrase += Character.toString(letter);
            }
        }
        return newFrase;
    }
    
    public boolean contiene(Cadena c1, String letra){
        int lg = c1.getLongitud();
        String frase = c1.getFrase();
        char letter;
        boolean result = false;
        for (int i = 0; i < lg; i++) {
            letter = frase.charAt(i);
            if(Character.toString(letter).equals(letra)){
                result = true;
            }
        }
        return result;
    }
}
