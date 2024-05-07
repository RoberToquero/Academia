/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_5;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Arrays;
import java.util.Collections;
public class Ejercicio6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String matriz1[]={"L","M","X","J","V","S","D"};
        //Mostrar por pantalla el Array
        System.out.println(Arrays.toString(matriz1));
        String vocales[]={"a","e","i","o","u"};
        //Mostrar por pantalla el Array
        System.out.println(Arrays.toString(vocales));
        //Array vacío y mostrarlo por pantalla
        int matriz2[]=new int[7];
        System.out.println(Arrays.toString(matriz2));
        //Rellenar con valor 7 hasta el 4 y con valor 4 el resto e imprimirlo
        Arrays.fill(matriz2, 0,4,7);
        Arrays.fill(matriz2, 4,7,4);
        System.out.println(Arrays.toString(matriz2));
        //Crear un array con los dias laborables a partir del primero
        String matrizlab[]=Arrays.copyOfRange(matriz1, 0, 5);
        System.out.println(Arrays.toString(matrizlab));
        //Mostrar las vocales en orden inverso
        Arrays.sort(vocales,Collections.reverseOrder());
        System.out.println(Arrays.toString(vocales));
        //Mostrar la posicion de la letra e
        System.out.println("La vocal e ocupa la posición: " + Arrays.binarySearch(vocales, "e"));
        //Colocarlo como antes y mostrar la posicion de la letra e
        Arrays.sort(vocales);
        System.out.println("La vocal e ocupa la posición: " + Arrays.binarySearch(vocales, "e"));
        //Rellenar un Array multidimensional con uno unidimensional
        int numeros[][]=new int[2][2];
        numeros[0]=Arrays.copyOfRange(matriz2,0,2);
        numeros[1]=Arrays.copyOfRange(matriz2,2,4);
          System.out.println(Arrays.toString(numeros));
        //comprobar el tamaño de los arrays numeros[0] y numeros[1]
        System.out.println("El tamaño del array 0 es: " + numeros[0].length +" \n" +"El tamaño del array 1 es: " + numeros[1].length);
        //Comprobar si los array son iguales
        
        if(Arrays.equals(numeros[0], numeros[1])){
            System.out.println("Los arrays numeros[0] y numeros[1] son iguales");
        }
        else{
            System.out.println("Los arrays numeros[0] y numeros[1] no son iguales");
        }
        //Matriz2 mostrado al revés
        for(int i=matriz2.length-1;i>=0;i--){
                System.out.print(Arrays.toString(matriz2));
                break;
    }
        
        
        
        
        
        
        
    }
    
}
