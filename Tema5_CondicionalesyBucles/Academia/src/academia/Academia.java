/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Academia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String academia=JOptionPane.showInputDialog(null,"¿Cómo se llama la academia donde estudias","Introducción de datos", 3);
        if(academia.equals("")){
            JOptionPane.showMessageDialog(null,"No has escrito nada", "Información",1);
        }
            else if(academia.equalsIgnoreCase("Fray Luis Centro Académico")){
                JOptionPane.showMessageDialog(null,"¡¡¡Correcto!!!", "Información",1);
            }
            else{
                JOptionPane.showMessageDialog(null,"No, te has equivocado", "Información",1);
            }
    }
    
}
