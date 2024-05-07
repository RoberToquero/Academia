/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_37;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean condicion=false;
        while(condicion==false){
            System.out.println("Introduce un número: ");
            int numero=sc.nextInt();
            if( numero>=1 && numero<=20)
                for(int i =1;i<=20;i++){
                    if(i==numero){
                        break;
                    }               
                System.out.println(i);
                }
                    else{
                  System.out.println("Número no válido, debe ser un número entre 0 y 20");
              }
        
          System.out.println("Quieres repetir? Si o no");
            String respuesta=sc.next();
            if(respuesta.equals("no")){
                condicion=true;
            }  
        }
    }    
}
