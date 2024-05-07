/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_17;

import javax.swing.JOptionPane;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Object [] elegir={"A","B"};
        int puntuacion=0;
        int opcion1=JOptionPane.showOptionDialog(null, "¿Quieres jugar?", "Juego", 1, 3, null, null, null);
        if(opcion1==0){
            int repetir=0;
            puntuacion=puntuacion+2;
            while(repetir==0){
            JOptionPane.showMessageDialog(null,"Tu puntuación es: " + puntuacion,"Puntos", 1);
            int opcion2=JOptionPane.showOptionDialog(null, "Elige una opción", "Juego", 2, 3, null, elegir, null);
            if(opcion2==0){
                 puntuacion= puntuacion + (int)(Math.random()*(20-10+1)+10);
                 JOptionPane.showMessageDialog(null,"Tu puntuación es: " + puntuacion,"Puntos", 1);
                 int opcion3=JOptionPane.showOptionDialog(null, "Elige una opción", "Juego", 0, 3, null, null, null);
                 if(opcion3==0){
                     puntuacion=puntuacion+2;
                     if(puntuacion>20){
                         JOptionPane.showMessageDialog(null,"¡Has ganado!  tu puntuación final es: " + puntuacion,"FIN", 1);
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"¡Has perdido! tu puntuación final es: " + puntuacion,"FIN", 0);
                     }
                 }
                 else if(opcion3==1){
                     if(puntuacion>20){
                         JOptionPane.showMessageDialog(null,"¡Has ganado!  tu puntuación final es: " + puntuacion,"FIN", 1);
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"¡Has perdido! tu puntuación final es: " + puntuacion,"FIN", 0);   
                     }
                 }
            }
            else if(opcion2==1){
                puntuacion= puntuacion + (int)(Math.random()*(25-15+1)+15);
                JOptionPane.showMessageDialog(null,"Tu puntuación es: " + puntuacion,"Puntos", 1);
                 int opcion4=JOptionPane.showOptionDialog(null, "Elige una opción", "Juego", 2, 3, null, null, null);
                 if(opcion4==0){
                     puntuacion=puntuacion+2;
                     if(puntuacion>20){
                         JOptionPane.showMessageDialog(null,"¡Has ganado!  tu puntuación final es: " + puntuacion,"FIN", 1);
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"¡Has perdido! tu puntuación final es: " + puntuacion,"FIN", 0);
                     }
                 }
                 else if(opcion4!=0){
                     if(puntuacion>20){
                         JOptionPane.showMessageDialog(null,"¡Has ganado!  tu puntuación final es: " + puntuacion,"FIN", 1);
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"¡Has perdido! tu puntuación final es: " + puntuacion,"FIN", 0);   
                     }
                 }
            }
            repetir=JOptionPane.showOptionDialog(null, "¿Quieres volver a jugar?", "Juego", 1, 3, null, null, null);
            puntuacion=0;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"El usuario no quiere jugar","Fin del juego",1);
        }
    }
    
}
