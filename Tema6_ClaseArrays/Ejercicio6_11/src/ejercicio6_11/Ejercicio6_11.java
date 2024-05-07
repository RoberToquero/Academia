/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> alturas=new ArrayList();
        System.out.println("¿Cuántas personas quieres que introduzcan su altura?");
        int n=sc.nextInt();
        float altura;
        float media=0;
        float sumaAlturas=0;
        
        for(int i =0;i<n;i++){
            System.out.println("Introduce tu altura en metros: ");
            altura=sc.nextFloat();
            alturas.add(altura);
            sumaAlturas+=altura;
        }
        media=sumaAlturas/n;
        System.out.println(alturas);
        System.out.printf("Estatura media: %.2f m %n", media);
        int contadorSuperior=0;
        int contadorInferior=0;
        
        for(int i=0;i<alturas.size();i++){
            if(alturas.get(i)>media){
                contadorSuperior++;
            }
            else{
                contadorInferior++;
            }
        }
        System.out.println("La cantidad de personas con más altura que la media es: " + contadorSuperior);
         System.out.println("La cantidad de personas con menos altura que la media es: " + contadorInferior);
        
        
        
        
    }
    
}
