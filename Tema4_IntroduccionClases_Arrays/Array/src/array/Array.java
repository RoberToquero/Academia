/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int x[] = new int[3];
         x[0]=100;
         x[1]=300;
         x[2]=500;
         System.out.println("Introduce un número del 0 al 2: ");
         int n=sc.nextInt();
         System.out.println(x[n]);
         int j = x.length;
         System.out.println(j);
        
         
         
    }
    
}
