/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica3;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
public class ListaDinamica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaraci�n y definici�n del ArrayList
       ArrayList<Integer> matriz=new ArrayList();
       ArrayList<Integer> matriz1=new ArrayList();
       ArrayList<String> cadenas=new ArrayList();
       //A�adimos los datos matriz
       matriz.add(1);
       matriz.add(7);
       //A�adimos dos datos a la matriz1
       matriz1.add(3);
       matriz1.add(5);
       matriz.addAll(matriz1);
        System.out.println(matriz);
       //Integramos una lista al final de la otra
       matriz.addAll(matriz1);
        System.out.println(matriz);
        //Integramos una lista en medio de la otra
        matriz.addAll(1,matriz1);
        System.out.println(matriz);
        // �Qu� elemento ocupa la posici�n 3?
        System.out.println(matriz.get(3));
        //Sustituir el n�mero 5 de la posici�n 2 por 0
        matriz.set(2,0);
        System.out.println(matriz);
        //�Qu� posici�n ocupa el primer dato 3?
        System.out.println(matriz.indexOf(3));
        //�Qu� posici�n ocupa el primer dato -6?
        System.out.println(matriz.indexOf(-6));
        //�Qu� posici�n ocupa el �ltimo dato 3?
        System.out.println(matriz.lastIndexOf(3));
        //�Est� 12 en la lista?
        System.out.println(matriz.contains(12));
        //�Est� 0 en la lista?
        System.out.println(matriz.contains(0));
        System.out.println("**********************");
        cadenas.add("Elemento 0");
        cadenas.add("Elemento 1");
        cadenas.add("Elemento 2");
        cadenas.add("Elemento 3");
        cadenas.add("Elemento 4");
        cadenas.add("Elemento 5");
        System.out.println(cadenas);
        //Recordamos la lista matriz
        System.out.println(matriz);
        //Borramos el elemento de la posici�n 3 de ambas listas
        matriz.remove(3);
        cadenas.remove(3);
        System.out.println(matriz);
        System.out.println(cadenas);
        //Borramos el valor Elemento4 de la lista cadenas
        cadenas.remove("Elemento4");
        //Borramos la primera coincidencia del valor 3 de la lista matriz
        //La sintaxis correcta tiene dos posibilidades
        matriz.remove(new Integer(3));
        //matriz.remove(Integer.valueOf(3));
        System.out.println(matriz);
        System.out.println(cadenas);
        
        System.out.println("*****************");
        System.out.println(matriz1);
        //Eliminar los elementos de matriz que coinciden con los de matriz1
        matriz.removeAll(matriz1);
        System.out.println(matriz);
        System.out.println("****************");
        //Eliminaremos los elementos de la lista matriz1(no la lista)
        matriz1.clear();
        System.out.println(matriz1);
        System.out.println("************************");
        //Se mostrar� una sublista de cadenas con los elementos del 1 al 3
        //Es decir se muestran los elementos 1 y 2
        System.out.println(cadenas.subList(1, 3));
        
        
       
    }
    
}
