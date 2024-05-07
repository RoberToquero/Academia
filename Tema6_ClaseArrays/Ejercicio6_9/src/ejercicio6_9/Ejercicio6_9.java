/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_9;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio6_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros[]=new int[10];
        System.out.println("Introduce 10 números: ");
        for(int i=0;i<numeros.length;i++){
            numeros[i]=sc.nextInt();            
        }
        int ordenado[]=Arrays.copyOf(numeros,10);
         System.out.println("**********************");
          Arrays.sort(ordenado);
        System.out.println(Arrays.toString(ordenado));
        
        System.out.println("**********************************");
        int contadorPositivo=0;
        int contadorNegativo=0;
        int contadorCero=0;
        ArrayList<Integer> positivos=new ArrayList();
        ArrayList<Integer> negativos=new ArrayList();
        ArrayList<Integer> ceros=new ArrayList();
       
       
        for (int i=0;i<ordenado.length;i++){
            int valor=ordenado[i];
            if(ordenado[i]>0){ 
                contadorPositivo++;
                positivos.add(valor);    
            }
            else if(ordenado[i]<0){
               contadorNegativo++;
               negativos.add(valor);   
           }
            else{
                contadorCero++;
                ceros.add(valor); 
            }
        }
        System.out.println("Hay " + contadorPositivo+ " números positivos\n" + "Hay " + contadorNegativo+ " números negativos\n" + "Hay " + contadorCero+ " ceros ");
       
        System.out.println("Array de positivos " + positivos); 
        System.out.println("Array de negativos " + negativos);
        System.out.println("Array de ceros: " + ceros);
       
        
       
    }
    
}
