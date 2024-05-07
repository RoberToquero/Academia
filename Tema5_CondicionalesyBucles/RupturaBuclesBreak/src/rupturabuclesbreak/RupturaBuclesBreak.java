/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rupturabuclesbreak;

/**
 *
 * @author COOLBOX_SSD5
 */
public class RupturaBuclesBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        //Comienzo del bucle
        for(i=1;i<=6;i++){
            if(i==3){
                continue;
            }
            //Indicamos las instrucciones a ejecutar y repetir por el bucle
            System.out.println("Iteracción número " +i+" del bucle");
            //Fin del bucle
        }
        System.out.println("Saltamos la iteracción número 3 del bucle");
    }
    
}
