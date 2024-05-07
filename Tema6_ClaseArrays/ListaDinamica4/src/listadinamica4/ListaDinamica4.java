/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica4;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
import java.util.Arrays;
public class ListaDinamica4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Declaración y definición de ArrayList
        ArrayList<Integer>matriz=new ArrayList();
        ArrayList<Integer>matriz1=new ArrayList();
        matriz1.add(1);
        matriz1.add(2);
        matriz1.add(3);
        matriz1.add(4);
        matriz1.add(5);
        matriz1.add(6);
        matriz1.add(7);
        
        for(int i =0;i<=8;i+=2){
            matriz.add(i);
        }
        System.out.println(matriz);
        System.out.println(matriz1);
        
        //Buscaremos los elementos comunes entre las dos listas
        System.out.println(matriz.retainAll(matriz1));
        System.out.println(matriz);
        System.out.println("*****************");
        ArrayList matriz2=(ArrayList)matriz1.clone();
        System.out.println(matriz2);
        System.out.println("*****************");
        //Se precisa la clase envolvente de Arrays para enteros
        Integer matriz3[]=new Integer[matriz1.size()];
        matriz3=matriz1.toArray(matriz3);
        System.out.println(Arrays.toString(matriz3));
    }
    
}
