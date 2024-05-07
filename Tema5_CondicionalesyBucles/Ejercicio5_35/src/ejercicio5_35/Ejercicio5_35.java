/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_35;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        do{
            int aleatorio=(int)(Math.random()*100+1);
            i++;
            if(aleatorio>=40 && aleatorio<=50){
                break;
            }
            System.out.println(aleatorio);
        }while(i<150);
        
        
    }
    
}
