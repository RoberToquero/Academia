/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_4;

import java.util.Scanner;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*System.out.println("Introduce un n�mero: ");
        String cadena = sc.nextLine();
        cadena= cadena.trim();
        String cadena1="";
        for(int i=cadena.length()-1;i>=0;i--){
            cadena1+=cadena.charAt(i);
        }
        if (cadena.equals(cadena1)){
            System.out.println("El n�mero es capic�a");
        }
        else{
            System.out.println("El n�mero no es capic�a");
        }*/
        System.out.println("Introduce una palabra: ");
         String cadena = sc.nextLine();
        cadena= cadena.trim();
        String cadena1="";
        for(int i=cadena.length()-1;i>=0;i--){
            cadena1+=cadena.charAt(i);
        }
        if (cadena.equalsIgnoreCase(cadena1)){
            System.out.println("Tu palabra es un pal�ndromo");
        }
        else{
            System.out.println("Tu palabra no es un pal�ndromo");
        
        
        }
        System.out.println(cadena + " - " + cadena1);
    }     
}
