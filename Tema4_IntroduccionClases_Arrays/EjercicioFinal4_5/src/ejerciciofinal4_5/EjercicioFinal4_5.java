/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofinal4_5;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class EjercicioFinal4_5 {

    /**
     * @param args the command line arguments
     */
    String nombre;
    String edad;
    String profesion;
    String ciudad;
    public void capturarDatos(){
     Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduce tu edad: ");
        edad=sc.nextLine();
        System.out.println("Introduce tu profesion: ");
        profesion=sc.nextLine();
        System.out.println("Introduce tu ciudad: ");
        ciudad=sc.nextLine();
}
    public void mostrarDatos(){
        System.out.println("nombre:\n" + nombre + "\nedad:\n" + edad + " \nprofesion:\n " + profesion + " \nciudad:\n " + ciudad);
    }
    public static void main(String[] args) {
       
        EjercicioFinal4_5 ejemplo= new EjercicioFinal4_5();
        ejemplo.capturarDatos();
        ejemplo.mostrarDatos();
        
    }
    
}
