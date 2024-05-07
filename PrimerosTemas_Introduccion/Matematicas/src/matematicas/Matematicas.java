/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematicas;

/**
 *
 * @author COOLBOX_SSD5
 */
//FUNCIONES MATEMÁTICAS EN JAVA

public class Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Constante PI*/
        double PI= Math.PI;
        System.out.println("El valor de PI = " + PI);
        /*Valor absoluto de -2*/
        int x1=Math.abs(-2);
        System.out.println("Valor absoluto |-2|= " + x1);
        /*Seno de PI radianes*/
        double x2=Math.sin(PI);
        System.out.println("El seno de PI Radianes= " + x2);
        /*Coseno de PI radianes*/
        double x3=Math.cos(PI);
        System.out.println("El coseno de PI Radianes= " + x3);
        /*Tangente de PI radianes*/
        double x4= Math.tan(PI);
        System.out.println("La tangente de PI Radianes= " + x4);
        /*número e elevado a 1*/
        double x5=Math.exp(1);
        System.out.println("Número e elevado a 1 = " + x5);
        /*Logaritmo neperiano de 2.71*/
        double x6= Math.log(2.71);
        System.out.println("El logaritmo neperiano de 2.71= " + x6);
        /*Cálculo de 2 elevado al cubo*/
        double x7=Math.pow(2, 3);
        System.out.println("2 elevado al cubo= " + x7);
        /*Cáculo de raíz cuadrada de 25*/
        double x8=Math.sqrt(25);
        System.out.println("Raiz cuadrada de 25= " + x8);
        /*Elección aleatoria de un número entre 0 y 1*/
        double x9=Math.random();
        System.out.println("Número aleatorio entre 0 y 1= " + x9);
        /*Raiz cubica de 8*/
        double x10=Math.pow(8,0.3333);
        System.out.println("Raíz cúbica de 8= " + x10);
        /*Generación de números enteros aleatorios entre 5 y 10*/
        int x11=(int)(Math.random()*(10-5+1)+5);
        System.out.println("Número aleatorio entre 5 y 10= " + x11);
    }
    
}
