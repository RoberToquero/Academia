/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalcapitulo4_1;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Empleado {
    String nombre;
    int sueldo;
    public void recogerDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduce tu sueldo: ");
        sueldo=sc.nextInt();
    }
    public void devolverDatos(){
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu sueldo es: " + sueldo);
        
    }
    public static void main(String[] args) {
        Empleado n = new Empleado();
        n.recogerDatos();
        n.devolverDatos();
    }
}
