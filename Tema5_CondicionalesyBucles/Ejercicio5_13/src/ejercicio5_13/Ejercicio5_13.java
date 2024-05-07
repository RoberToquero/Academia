/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_13;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        switch(numero){
            case 0:
            { 
                    System.out.println("El número es nulo");
                    break;
               
            }
          default:
            {  
                if(numero>0){
                    System.out.println("El número es positivo");
                }
                else {
                    System.out.println("El número es negativo");
                }
            }
            
        }
    }
    
}
