/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final4_9;

/**
 *
 * @author COOLBOX_SSD5
 */

import javax.swing.JOptionPane;
public class Final4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un número", "Producto de números", 3));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe otro número", "Producto de números", 3));
        JOptionPane.showMessageDialog(null,"El resultado es: " + x*y, "Resultado", 1);
        
        
    }
    
}
