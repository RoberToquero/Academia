/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_27;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            int boleto=(int)(Math.random()*50+1);
            System.out.println(boleto);
              
        }
        System.out.println("*************************");
        for(int i=0;i<2;i++){
            int estrellas=(int)(Math.random()*9);
            System.out.println(estrellas);
        }
    }   
}
