/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_23;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int suma=0;
        int contador=-1;
        do{
            System.out.println("Introduce un número o introduce 0 para salir "); 
            numero=sc.nextInt();
            suma+=numero;
            contador++;
        }while(numero!=0);
        if(contador==0){
            System.out.println("No se han introducido números");
        }
        else{
        double promedio=(double)suma/(double)(contador);
        System.out.println("El promedio de los números que has introducido es: " + promedio);
        }
    }
    
}
