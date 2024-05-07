/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_5;

import java.util.Scanner;

/**
 *
 * @author COOLBOX_SSD5
 */

public class Ejercicio5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        if(n<10){
            System.out.println("El número: " + n + " es menor que 10");
        }
        else{
            System.out.println("El número: " + n + " es mayor o igual que 10");
        }
    }
    
}
