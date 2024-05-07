/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_31;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condicion=false;
        int suma=0;
        for(int i=0;!condicion;i++){
            String numero=JOptionPane.showInputDialog(null,"Introduce un número o escribe acabar para terminar, la suma actual es: " + suma, "Suma de números", 1);
            if(numero.equalsIgnoreCase("acabar")){
            condicion=true;
            }
            else{
            suma+=Integer.parseInt(numero); 
             }        
        }
    }
    
}
