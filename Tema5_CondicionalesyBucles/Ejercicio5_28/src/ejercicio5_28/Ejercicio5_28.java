/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_28;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=0;
       for(int i=1000;i>1;i-=2){
           System.out.print(i + "\t");
           contador++;
           if(contador%20==0){
               System.out.println();
           }
           
       }
    }
    
}
