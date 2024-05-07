/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_1;

import java.util.Arrays;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena1 ="Cadena para pruebas";
       String cadena2=" Cadena para pruebas ";
       String cadena3="cadena para pruebas";
       String cadena4="concatenada con una nueva cadena";
       String cadena5="Cadena a";
       String cadena6="Cadena A";
       char[] arraycadena7={'C','a','d','e','n','a'};
       int numero=5;
       String cadenanumero;
       //Transformar toda la cadena a mayúsculas
        System.out.println(cadena1.toUpperCase());
       //Transformar toda la cadena a minúsculas
        System.out.println(cadena1.toLowerCase());
        //Comparar cadenas
        System.out.println("¿Cadena 1 es igual a Cadena 2? " + cadena1.equals(cadena2));
        System.out.println("¿Cadena 1 es igual a Cadena 3? " + cadena1.equals(cadena3));
        //Comparar cadenas sin distinguir mayúsculas de minúsculas
        System.out.println("¿Cadena 1 es igual a Cadena 3?" + cadena1.equalsIgnoreCase(cadena3));
        //Medir la longitud de la cadena
        System.out.println(cadena1.length() + "caracteres");
        //Cadena sin espacios en blanco por delante y por detrás
        System.out.println(cadena2.trim());
        //Devuelve el carácter que coincide con el índice indicado en el parámetro
        //índice comienza en cero de tal forma que índice 2 corresponde con el tercer carácter
        System.out.println("Tercer caracter de la cadena: " + cadena1.charAt(2));
        //Separamos la cadena original en caracteres a acumular en un array
        System.out.println("String toceado: " + Arrays.toString(cadena1.toCharArray()));
        //Concatenamos dos cadenas de distinta forma pero con el mismo resultado
        System.out.println(cadena1 + cadena4);
        System.out.println(cadena1.concat(cadena4));
        //Comparar dos cadenas
        System.out.println(cadena5.compareTo(cadena6));
        //Comparamos dos cadenas ignorando mayúsculas y minúsculas
        System.out.println(cadena5.compareToIgnoreCase(cadena6));
        //Convertir un array char en cadena
        String cadena7=String.copyValueOf(arraycadena7);
        System.out.println(cadena7);
        
        //Array tipo bytes con los códicos ASCII de los caracteres de la cadena 7
        System.out.println(Arrays.toString(cadena6.getBytes()));
        //Extraer partes de una cadena empezando en el caracter 4(posicion3) hasta el final
        System.out.println(cadena7.substring(3,6));
        //Ver si la cadena5 comienza por ?
        System.out.println("La cadena5 comienza con los caracteres \"Cad\": "+ cadena5.startsWith("Cadena"));
        //La cadena5 termina por Cadena?
        System.out.println("La cadena5 comienza con los caracteres \"Cad\": "+ cadena5.endsWith("Cadena"));
        //Posición que ocupa la p en la cadena1
        System.out.println("Posición de la primera p en la cadena 1: " + cadena1.indexOf("p"));
        //¿Hay p a partir de la posción 13?
        System.out.println("¿Hay p a partir de la posción 13?: " + cadena1.indexOf("p",13));
        //Posicion de la última p en la cadena 1
        System.out.println("Posición de la última p en la cadena 1: "+ cadena1.lastIndexOf("p"));
        //Última a dentro de las 6 posiciones iniciales
        System.out.println("En la cadena1 última a dentro de las 6 primeras posiciones: " + cadena1.lastIndexOf("a",6));
        
        //Transformar el valor entero 5 en String
        cadenanumero=String.valueOf(numero);
        System.out.println("Entero transformado en cadena " + cadenanumero);
        //En cadena1 remplazar pruebas por experimentos
        System.out.println(cadena1.replace("pruebas", "experimentos"));
        
    }
    
}
