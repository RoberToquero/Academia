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
        System.out.println("JUEGO DE PU�O PALMA EN JAVA");
        
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Iteracci�n n�mero: " + i + " Pu�oPalma");
            }
            else if(i%3==0){
                System.out.println("Iteracci�n n�mero: " + i + " Pu�o");
            }
            else if(i%5==0){
                 System.out.println("Iteracci�n n�mero: " + i + " Palma");
            }
            else{
                System.out.println("Iteracci�n n�mero: " + i);
            }
            
        }
    }
    
}
