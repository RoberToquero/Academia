/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_8;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion1=JOptionPane.showConfirmDialog(null,"¿Te gusta Beethoven?","Pregunta",0,3,null);
        if(opcion1==0){
            JOptionPane.showMessageDialog(null,"Tienes buen gusto", "Respuesta", 1);
        }
        else if(opcion1==1){
            JOptionPane.showMessageDialog(null,"¡Quizás deberías escuchar más música clásica!", "Respuesta", 1);
        }
        else{
            JOptionPane.showMessageDialog(null,"Por educación, deberías haber respondido a la pregunta", "Respuesta", 0);
        }
    }
    
}
