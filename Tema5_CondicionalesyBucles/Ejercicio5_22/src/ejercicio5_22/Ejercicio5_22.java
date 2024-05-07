/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_22;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Ejercicio5_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String rep="";
        do{
            System.out.println("Introduce un número entre 0 y 999");
            String numero=sc.next();
            if (numero.length()>3){
                System.out.println("Has escrito un número no válido");
            }
            else{
            System.out.println("El número de dígitos es: " + numero.length());
            }
            rep=numero;
        }while(!rep.equals("0"));
       
        
    }
    
}
