/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleforbooleano;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class BucleForBooleano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n;
        boolean resp=false;
        Scanner datosteclado=new Scanner(System.in);
        System.out.println("¿Cuál es el resultado de 12x12?");
        for(i=0;resp!=true;i++){
            n=datosteclado.nextInt();
            if(n==144){
                resp=true;
            }
        }
        System.out.println("Has necesitado " + i + " intentos.");
    }
    
}
