/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabuclewhile2;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class PracticaBucleWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color="";
        //Mientras que el color no sea negro continuará el bucle
        do{
             //Solicitamos un color 
            color=JOptionPane.showInputDialog(null,"Seleccione un color: ", "Colores",3);
            //Transformamos el color leído a mayúsculas
            color=color.toUpperCase();
            
        }while(color.equals("NEGRO")==false);
        JOptionPane.showMessageDialog(null, "El color fue NEGRO.", "Colores", 1);
    }
    
}
