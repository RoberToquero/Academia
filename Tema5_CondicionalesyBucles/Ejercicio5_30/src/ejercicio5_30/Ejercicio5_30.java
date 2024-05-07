/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_30;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("JUEGO DE PUÑO PALMA EN JAVA");
        
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Iteracción número: " + i + " PuñoPalma");
            }
            else if(i%3==0){
                System.out.println("Iteracción número: " + i + " Puño");
            }
            else if(i%5==0){
                 System.out.println("Iteracción número: " + i + " Palma");
            }
            else{
                System.out.println("Iteracción número: " + i);
            }
            
        }
    }
    
}
