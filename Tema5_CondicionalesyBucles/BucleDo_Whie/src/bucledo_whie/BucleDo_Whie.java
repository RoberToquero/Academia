/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucledo_whie;

/**
 *
 * @author COOLBOX_SSD5
 */
public class BucleDo_Whie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniciamos la variable que condicionará el bucle
        int i =10;
        //Comienza el bucle do While
        do{
            //Actualizamos la variable que controla el bucle
            i++;
            //Indicamos el resto de instrucciones a ejecutar y repetir por el bucle
            System.out.println("Interacción número: " + i);
        }
        while(i<6);
    }   
    
}
