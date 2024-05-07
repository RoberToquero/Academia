/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_7;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ejercicio6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> numeros=new ArrayList();
       
       while(!numeros.contains(0)){
           int input=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número, o introduce 0 para salir ", "Números", 3));
           numeros.add(input);
       }
        JOptionPane.showMessageDialog(null,"Has introducido un total de: " + (numeros.size()-1) + " números", "Total", 1);
        int suma=0;
        for(int i=0;i<numeros.size();i++){
            suma+=numeros.get(i);
        }
        JOptionPane.showMessageDialog(null,"La suma de tus números es: " + suma, "Suma", 1);
        
        double media=(double)suma/(double)(numeros.size()-1);
        JOptionPane.showMessageDialog(null,"La media de tus números es: " + Math.floor(media*100)/100., "Media", 1);
    }
    
}
