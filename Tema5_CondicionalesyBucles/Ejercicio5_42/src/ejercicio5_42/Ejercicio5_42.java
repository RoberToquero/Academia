/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_42;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero[]=new int[5];
        for(int i =0;i<5;i++){
            System.out.println("Inserte un número: ");
            numero[i]=sc.nextInt();  
        }
        for(int i=0;i<numero.length;i++){
            int max=numero[i];
            for(int j=i;j<numero.length;j++){
                if(numero[j]> max){
                    max=numero[j];
                    int x=numero[i];
                    numero[i]=max;
                    numero[j]=x;
                }   
            }
        }
        for(int i=0;i<numero.length;i++){
            System.out.print(numero[i] + "\t");
        }
        
    }
    
}
