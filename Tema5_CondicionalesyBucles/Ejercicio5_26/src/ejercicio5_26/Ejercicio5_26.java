/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_26;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero=sc.nextInt();
        for(int i=0;i<=10;i++){
            int producto= numero*i;
            System.out.println(numero + " x " + i + " = " + producto);
        }
        
    }
    
}
