import java.util.Arrays;
// java.utils.Arrays es necesario para utilizar los métodos Arrays
import java.util.Collections;
//Importa el método para invertir el orden en arrays String
public class Vectores {
    public static void main(String[ ] ar) {
        boolean p;
        //Inicializar y definir en la misma sentencia
        String conjunto1[] = {"100", "200", "300", "400", "500"};
        int conjunto2[]={300,50,200,100,40};
        int conjunto3[]={300,50,200,100,40};
        //ordena el array
        Arrays.sort(conjunto3);
        System.out.println("Conjunto3 ordenado de forma ascendente: ");
        //Mostramos el array ordenado de forma ascendente
        for(int dato3:conjunto3){
            System.out.println(dato3);
        }
        //Ordena el array String de forma descendente
        Arrays.sort(conjunto1,Collections.reverseOrder());
        System.out.println("Conjunto1 ordenado de forma descendente: ");
        //Mostramos el array String ordenado de forma descendente
        for(String dato1:conjunto1){
            System.out.println(dato1);
        }
        //Reordenamos los índices 1,2 y 3 de conjunto2
        Arrays.sort(conjunto2,1,4);
        System.out.println("Conjunto2 ordenado ascendente en las posiciones 1 a 3:");
        //Mostramos el array ordenado de forma ascendente
        for(int dato2:conjunto2){
            System.out.println(dato2);
        }
       
        
        
     }

}
