/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_40;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palos[]={"Oros", "Espadas", "Bastos", "Copas"};
        String numero[]={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
        boolean condicion=true;
        while(condicion==true){
            int aleatorio1=(int)(Math.random()*palos.length);
            int aleatorio2=(int)(Math.random()*10);
            System.out.println(numero[aleatorio2] + " de " + palos[aleatorio1]);
                    
            System.out.println("¿Quieres sacar otra carta?");
            String elegir=sc.nextLine();
            if (elegir.equalsIgnoreCase("no")){
                condicion=false;
            }
        }     
          
    }
    
}
