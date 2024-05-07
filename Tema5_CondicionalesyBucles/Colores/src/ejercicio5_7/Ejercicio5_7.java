/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_7;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] pos_color={"Rojo","Amarillo", "Verde", "Azul"};
        int valor_opcion; // Variable valor de la opción
       
        valor_opcion=JOptionPane.showOptionDialog(null,"Indique un color","Cuadro de opciones",2,2,null,pos_color,pos_color[2]);
        
        //JOptionPane.showMessageDialog(null, "el valor de la opcion elegida es: "+valor_opcion+" ","informacion",1);
    }
    
}
