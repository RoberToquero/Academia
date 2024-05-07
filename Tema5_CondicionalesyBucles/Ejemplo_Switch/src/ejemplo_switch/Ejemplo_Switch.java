/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_switch;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejemplo_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion; //Variable valor de la opcion
        float lado,base,altura;
        Object[] figuras={"Cuadrado","Rectángulo","Triángulo"}; //Figuras
        opcion=JOptionPane.showOptionDialog(null,"Seleccione una figura", "Cuadro de figuras", -1, 3, null, figuras, null);
        switch(opcion)
        {
            /*case -1:
            {
                JOptionPane.showMessageDialog(null,"No se seleccionó ninguna figura", "Información",1);
                break;
            }*/
            case 0:
            {
                lado=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique el lado del cuadrado: ", "Datos", 3));
                JOptionPane.showMessageDialog(null,"El área es igual a: " + lado*lado + " u2", "Cálculo de áreas", 1);
                break;
            }
            case 1:
            {
                base=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique base del rectángulo: ", "Datos", 3));
                altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique altura del rectángulo: ", "Datos", 3));
                JOptionPane.showMessageDialog(null,"El área es igual a: " + base*altura + " u2", "Cálculo de áreas", 1);
                break;
            }
            case 2:
            {
              base=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique base del triángulo: ", "Datos", 3));
              altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique altura del triángulo: ", "Datos", 3));
              JOptionPane.showMessageDialog(null,"El área es igual a: " + (base*altura)/2 + " u2", "Cálculo de áreas", 1);   
            }
            default:
                JOptionPane.showMessageDialog(null,"No se seleccionó ninguna figura", "Información",1);
                break;
        }
    }
    
}
