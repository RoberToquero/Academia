/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oper_cond;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Oper_Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String mensaje;
        //Leemos un valor entero desde el cuadro de diálogo
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique su edad:", "Datos",3));
        mensaje=(edad>=18)?"Mayor de edad":"Menor de edad";
        JOptionPane.showMessageDialog(null,"Usted es: " + mensaje+" ","Información",1);
        
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número", "Datos",3));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce otro número", "Datos",3));
        int z=(x>y)?x:y;
        JOptionPane.showMessageDialog(null,"El número mayor es:  " + z +" ","Información",1);
    }
    
}
