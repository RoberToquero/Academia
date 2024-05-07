/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_3;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique su edad:", "Datos",3));
        if(edad>=18){
            JOptionPane.showMessageDialog(null,"Usted es mayor de edad","Información",1);
        }
        else{
            JOptionPane.showMessageDialog(null,"Usted es menor de edad","Información",1);
        }      
    }   
}
