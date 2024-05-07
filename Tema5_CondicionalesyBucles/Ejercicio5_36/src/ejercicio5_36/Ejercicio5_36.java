/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_36;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Empleo de un for dentro de otro para mostrar las tablas de multiplicar
        for(int i=1;i<=10;i++){
            System.out.println("\nTabla del " + i);
            for(int j=0;j<=10;j++){
                System.out.println(i+" x "+j + " = " + i*j);
            }
            
        }
    }
    
}
