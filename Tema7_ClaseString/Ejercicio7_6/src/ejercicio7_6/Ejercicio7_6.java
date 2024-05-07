
package ejercicio7_6;

import java.util.Scanner;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena= "Solo se que no se nada";
        
         //Ejercicio6
        System.out.println("1º " + cadena.matches("Solo se que no se nada"));
        System.out.println("2º " + cadena.matches("[a-z].*"));
        System.out.println("3º " + cadena.matches("[A-Z].*"));
        
        //Ejercicio7
        System.out.println("********************************");
        String cadena1="abc1234";
        System.out.println("1º " + cadena1.matches("[abc]+.*"));
        System.out.println("2º " + cadena1.matches("[abc]+\\d{4}"));
        System.out.println("3º " + cadena1.matches("[abc]+\\d{1,10}"));
        
        //Ejercicio8
        System.out.println("*********************");
        String cadena2="La mar estaba serena, serena estaba la mar";
        System.out.println(cadena2);
        System.out.println(cadena2.replaceAll("[aeiou]", "a"));
        System.out.println(cadena2.replaceAll("[aeiou]", "e"));
        System.out.println(cadena2.replaceAll("[aeiou]", "i"));
        System.out.println(cadena2.replaceAll("[aeiou]", "o"));
        System.out.println(cadena2.replaceAll("[aeiou]", "u"));
        
        //Ejercicio 9 
        System.out.println("*******************************");
        String cadena3="La compuerta estaba abierta";
       if(cadena3.indexOf("ue")!=-1){
           System.out.println("La cadena ue aparece al menos una vez");
       }
       if(cadena3.indexOf("ue")!=cadena3.lastIndexOf("ue"))
            System.out.println("La cadena citada aparece más de una vez");
       
       //Ejercicio 10
        System.out.println("*******************************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        String cadena4="La aplicación fue realizada por Fray Luis. En la programación informática, Fray Luis era el mejor programador";
        String cadena5= cadena4.replaceAll("Fray Luis", nombre);
        System.out.println(cadena5);
        
    }
    
}
