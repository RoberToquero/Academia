/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opciones;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Opciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object op_marcada;
        String[] posibles={"rojo","amarillo","verde","azul","blanco","negro"};
        op_marcada=JOptionPane.showInputDialog(null, "Indique un color:", "Cuadro de opciones", 3,null,posibles,posibles[1]);
        //La matriz posibles recoge las opciones que se mostrarán al usuario
        //La opcion posibles [1] marca la opcion que saldrá por defecto
        JOptionPane.showMessageDialog(null,"La opción elegida es:" + " " + op_marcada + "", "Información",1);
        
        
    }
    
}
