/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5_2;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String respuesta;
       respuesta=JOptionPane.showInputDialog(null,"¿Quién descubrió América?", "Pregunta",3);
       String comprobar=(respuesta.equals("Cristobal Colón"))?"Correcto, Cristobal Colón desubrió América": "Su respuesta: " + respuesta + ", no es correcta";
       JOptionPane.showMessageDialog(null,comprobar,"Información",1);
    }
    
}
