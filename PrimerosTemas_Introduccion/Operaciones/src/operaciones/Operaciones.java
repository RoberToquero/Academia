/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author CoolBoxSSD4
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a =3.5f, e;
        int b =2, c=9;
        int d, log1=4,log2=5;
        float resultado;
        d=9%2; //Resto de dividir 9 entre dos, resultado esperado es 1
        e=a*2-c+a;/*Mezclando operadores de distinto tipo
        la operación se habrá convertido a la de mayor rango*/
        resultado = (b-c)/a+c;
        System.out.println("Resto entero de 9 dividido entre 2 es = " +d);
        System.out.println("Operando con enteros y decimales la operación es decimal=" +e);
        System.out.println("Podemos operar con enteros y que el resultado sea negativo =" + (b-c));
        System.out.println("Podemos hacer operaciones múltiples = " + resultado);
        System.out.println(3-5*8*(-4.5)+6);//Operación variables
        System.out.println(log1==log2);//false
        System.out.println(log1!=log2);//true
        System.out.println(log1<=log2);//true
        System.out.println(log1%2==0 && (log2%2==0));//false
        System.out.println(log1%2==0 || (log2%2==0));//true
        
    }
    
}
