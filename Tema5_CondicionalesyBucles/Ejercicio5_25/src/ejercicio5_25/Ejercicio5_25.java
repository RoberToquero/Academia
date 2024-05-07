/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio5_25;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador=-1;
        System.out.println("Introduce un número: ");
        int numero=sc.nextInt();
        do{     
            contador++;
            int producto=numero*contador;
            System.out.println(numero + " x " + contador + " = " + producto );
        }while(contador<10);
        
    }
    
}
