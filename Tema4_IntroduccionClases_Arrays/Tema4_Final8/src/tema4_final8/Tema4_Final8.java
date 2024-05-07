/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_final8;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Tema4_Final8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object opcion1;
        Object opcion2;
        Object opcion3;
        String primerPlato[]={"Pasta", "Sopa", "Lentejas", "Paella", "Puré"};
        String segundoPlato[]={"Albondigas", "Solomillo", "Salmón", "Chuletón", "Lubina"};
        String postre[]={"Fruta", "Natillas", "Tarta", "Yogur", "Helado"};
        opcion1=JOptionPane.showInputDialog(null,"Escoja un primer plato;", "Platos del día:",1,null,primerPlato,primerPlato[0]);
        opcion2=JOptionPane.showInputDialog(null,"Escoja un segundo plato;", "Platos del día:",1,null,segundoPlato,segundoPlato[0]);
        opcion3=JOptionPane.showInputDialog(null,"Escoja un postre;", "Platos del día:",1,null,postre,postre[0]);
        JOptionPane.showMessageDialog(null,"El menú elegido es:\n "+opcion1+"\n"+opcion2+"\n"+opcion3+"","Menú",1);
    }
    
}
