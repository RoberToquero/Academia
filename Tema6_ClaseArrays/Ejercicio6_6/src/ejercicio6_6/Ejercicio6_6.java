/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author COOLBOX_SSD5
 */

public class Ejercicio6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numeros[]=new int[4];
      int suma=0;
      for(int i=0;i<numeros.length;i++){
      numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce 4 números","Ejercicio",3));
      suma+=numeros[i];
 
      }
      Arrays.sort(numeros);
      String numerosOrdenados="";
      for(int i=0;i<numeros.length;i++){
          numerosOrdenados+=numeros[i] + " ";
      }
      
      JOptionPane.showMessageDialog(null,"Tus números son: " + numerosOrdenados, "Números", 1);
      
      double media=(double)suma/(double)numeros.length;
      JOptionPane.showMessageDialog(null,"La suma de los números es: " + suma, "Suma", 1);
      JOptionPane.showMessageDialog(null,"La media de los números es: " + media, "Media", 1);
          
      
      
      
      
      
    }
    
}
