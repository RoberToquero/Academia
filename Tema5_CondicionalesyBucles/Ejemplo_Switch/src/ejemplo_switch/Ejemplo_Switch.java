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
        Object[] figuras={"Cuadrado","Rect�ngulo","Tri�ngulo"}; //Figuras
        opcion=JOptionPane.showOptionDialog(null,"Seleccione una figura", "Cuadro de figuras", -1, 3, null, figuras, null);
        switch(opcion)
        {
            /*case -1:
            {
                JOptionPane.showMessageDialog(null,"No se seleccion� ninguna figura", "Informaci�n",1);
                break;
            }*/
            case 0:
            {
                lado=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique el lado del cuadrado: ", "Datos", 3));
                JOptionPane.showMessageDialog(null,"El �rea es igual a: " + lado*lado + " u2", "C�lculo de �reas", 1);
                break;
            }
            case 1:
            {
                base=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique base del rect�ngulo: ", "Datos", 3));
                altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique altura del rect�ngulo: ", "Datos", 3));
                JOptionPane.showMessageDialog(null,"El �rea es igual a: " + base*altura + " u2", "C�lculo de �reas", 1);
                break;
            }
            case 2:
            {
              base=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique base del tri�ngulo: ", "Datos", 3));
              altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Indique altura del tri�ngulo: ", "Datos", 3));
              JOptionPane.showMessageDialog(null,"El �rea es igual a: " + (base*altura)/2 + " u2", "C�lculo de �reas", 1);   
            }
            default:
                JOptionPane.showMessageDialog(null,"No se seleccion� ninguna figura", "Informaci�n",1);
                break;
        }
    }
    
}
