/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E","T"};
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu número del dni", "Calcular DNI", 3));
        int letra=numero%23;
        String n=letras[letra];
        JOptionPane.showMessageDialog(null,"El número completo del dni es: "+ numero+n,"Calcular DNI",1);
    }
    
}
