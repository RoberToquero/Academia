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
        String academia=JOptionPane.showInputDialog(null,"�C�mo se llama la academia donde estudias","Introducci�n de datos", 3);
        if(academia.equals("")){
            JOptionPane.showMessageDialog(null,"No has escrito nada", "Informaci�n",1);
        }
            else if(academia.equalsIgnoreCase("Fray Luis Centro Acad�mico")){
                JOptionPane.showMessageDialog(null,"���Correcto!!!", "Informaci�n",1);
            }
            else{
                JOptionPane.showMessageDialog(null,"No, te has equivocado", "Informaci�n",1);
            }
    }
    
}
