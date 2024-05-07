/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Triangulo {

    int lado;
    double area;
    
    public void capturarLado(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado:");
        lado=sc.nextInt();
       
    }
    public void imprimirArea(){
        area = Math.sqrt(3) * Math.pow(lado, 2)/4;
        System.out.println("El área es: " + area);
    }
    public void imprimirPerimetro(){
        int perimetro = lado*3;
        System.out.println("El perimetro es: " + perimetro);
    }
 
    public static void main(String[] args) {
        
        Triangulo t = new Triangulo();
        t.capturarLado();
        t.imprimirArea();
        t.imprimirPerimetro();
       
    }
    
}
