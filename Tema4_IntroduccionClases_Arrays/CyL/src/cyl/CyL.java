/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cyl;

/**
 *
 * @author COOLBOX_SSD5
 */
public class CyL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] castilla= {"Ávila","Burgos","León","Palencia","Salamanca","Segovia","Soria","Valladolid","Zamora"};
        int n;
        int aleatorio=(int)(Math.random()*9);
        System.out.println(castilla[aleatorio]);
        n = castilla.length;
        System.out.println("El número total de provincias es: " + n);
        
        
    }
    
}
