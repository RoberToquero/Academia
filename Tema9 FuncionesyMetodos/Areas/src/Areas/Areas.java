/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object [] opciones={"Cuadrado", "Rect�ngulo", "Tri�ngulo"};
        int repetir=0;
        while(repetir==0){
            int figura= JOptionPane.showOptionDialog(null, "Elige una figura geom�trica", "Calcular �rea", 1, 3, null, opciones, null);
            if(figura==0){
                area1();   
            }
            else if(figura==1){
                area2();
            }
            else if(figura==2){
                area3();
            }
          repetir=JOptionPane.showOptionDialog(null, "�Quieres volver a jugar?", "Juego", 0, 3, null, null, null);
        }
        
    }
    public static void area1(){
        int lado=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la medida del lado","Cuadrado",3));
        double areaCuadrado=Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El �rea del cuadrado es: " + areaCuadrado, "�rea del cuadrado", 1);
    }
    public static void area2(){
        int base=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la base","Rect�ngulo",3));
        int altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la altura","Rect�ngulo",3));
        double areaRectangulo=base*altura;
        JOptionPane.showMessageDialog(null, "El �rea del rect�ngulo es: " + areaRectangulo , "�rea del rect�ngulo", 1);
    }
    public static void area3(){
        int base=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la base","Tri�ngulo",3));
        int altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la altura","Tri�ngulo",3));
        double areaTriangulo=base*altura/2;
        JOptionPane.showMessageDialog(null, "El �rea del rect�ngulo es: " + areaTriangulo , "�rea del tri�ngulo", 1);
    }
    
}
