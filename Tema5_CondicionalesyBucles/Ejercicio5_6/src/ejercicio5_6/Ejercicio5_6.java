/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_6;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique su edad:", "Datos",3));
        if(edad<10){
            JOptionPane.showMessageDialog(null,"Eres un niño casi programador", "Respuesta",1);
        }
        else if(edad>=10 && edad<=18){
            JOptionPane.showMessageDialog(null,"Eres un joven con futuro en Java", "Respuesta",1);
        }
        else if(edad>18 && edad<90){
            JOptionPane.showMessageDialog(null,"Eres un adulto aprendiendo Java a fondo", "Respuesta",1);
        }
        else{
            JOptionPane.showMessageDialog(null,"Nunca es tarde para empezar con Java", "Respuesta",1);
        }
    }
    
}
