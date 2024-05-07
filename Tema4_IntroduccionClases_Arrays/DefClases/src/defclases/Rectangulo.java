/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defclases;

/**
 *
 * @author COOLBOX_SSD5
 */
 import java.util.Scanner;

public class Rectangulo {
    int largo, ancho;
    public void capturadatos(){
        Scanner datosteclado = new Scanner(System.in);
        System.out.println("Introduzca el largo del rectangulo:");
        largo=datosteclado.nextInt();
        System.out.println("Introduzca el ancho del rectángulo:");
        ancho=datosteclado.nextInt();
    }
    public void perimetro(){
    int perimetro;
    perimetro=(largo+ancho)*2;
    System.out.println("el perimetro es = "+perimetro+" u");
            }
    public void superficie(){
    int superficie;
    superficie=(largo*ancho);
    System.out.println("La superficie es = "+superficie+" u^2");
    }
    public static void main(String[] args){
    Rectangulo rect=new Rectangulo();
    rect.capturadatos();
    rect.perimetro();
    rect.superficie();

  }
 }           

