/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_33;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] almacen=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Introduce un n�mero: ");
            int numero=sc.nextInt();
            almacen[i]=numero;
        }
        int y;
        for(int x:almacen){
            //Si multiplicamos cada n�mero introducido resulta:
            y=x*5;
            System.out.println("El resultado de multiplicar tu n�mero por 5 ser�a: " + y);
        }
    }
    
}
