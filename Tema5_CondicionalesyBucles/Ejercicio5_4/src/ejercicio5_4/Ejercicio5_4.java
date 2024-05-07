/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author COOLBOX_SSD5
 */

public class Ejercicio5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta=JOptionPane.showInputDialog(null,"¿Quién descubrió América?", "Pregunta",3);
        if(respuesta.equalsIgnoreCase("Cristobal Colón")){
            JOptionPane.showMessageDialog(null,"Correcto, Cristobal Colón desubrió América", "Respuesta",1);
        }
        else{
            JOptionPane.showMessageDialog(null,"Su respuesta: " + respuesta + ", no es correcta", "Respuesta",1);
        }
        
    }
    
}
