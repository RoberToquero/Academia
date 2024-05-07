/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_10;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ejercicio6_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Integer> numeros=new ArrayList();
         boolean condicion=true;
         while(condicion==true){
            int numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número", "Números", 3));
            numeros.add(numero);
           int opcion=JOptionPane.showOptionDialog(null, "¿Quieres introducir más números?", "Números", 0,3,null,null,null);
           if(opcion==1||opcion==-1){
               condicion=false;
            }
         }
        int contadorPositivo=0;
        int contadorNegativo=0;
        int contadorCero=0;
        ArrayList<Integer> positivos=new ArrayList();
        ArrayList<Integer> negativos=new ArrayList();
        ArrayList<Integer> ceros=new ArrayList();
       
       
        for (int i=0;i<numeros.size();i++){
            int valor=numeros.get(i);
            if(numeros.get(i)>0){ 
                contadorPositivo++;
                positivos.add(valor);    
            }
            else if(numeros.get(i)<0){
               contadorNegativo++;
               negativos.add(valor);   
           }
            else{
                contadorCero++;
                ceros.add(valor); 
            }
        }
        System.out.println("Hay " + contadorPositivo+ " números positivos\n" + "Hay " + contadorNegativo+ " números negativos\n" + "Hay " + contadorCero+ " ceros ");
       
        System.out.println("Array de positivos " + positivos); 
        System.out.println("Array de negativos " + negativos);
        System.out.println("Array de ceros: " + ceros);
       
         
         
    }
    
}
