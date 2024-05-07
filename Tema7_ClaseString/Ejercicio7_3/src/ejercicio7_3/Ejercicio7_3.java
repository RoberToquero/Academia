/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_3;

import java.util.Scanner;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduce una frase: ");
        String cadena = sc.nextLine();
        cadena= cadena.trim();
        String cadena1="";
        for(int i=cadena.length()-1;i>=0;i--){
            cadena1+=cadena.charAt(i);
        }
        System.out.println(cadena + " - " + cadena1);
           
    }
    
}
