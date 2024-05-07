import java.util.Arrays;
// java.utils.Arrays es necesario para utilizar los métodos Arrays
public class Vectores {
    public static void main(String[ ] ar) {
        int n,i;
        //Inicializar y definir en la misma sentencia
        int conjunto1[] = {100, 200, 300, 400, 500};
        int conjunto2[]=new int[5];
        int conjunto3[]=new int[5];
        n=conjunto1.length;//Número de elementos del array
        //Rellenamos el Array conjunto2 con 100
        Arrays.fill(conjunto2, 100);
        //Mostramos por consola el Array anterior
        for(i=0;i<conjunto2.length;i++){
            System.out.println(conjunto2[i]);
        }
        //Arrays.fill(NombreArray, índice comienzo, índice final+1, valor a rellenar
        //Rellenamos el array conjunto3 con 100 en las posiciones 0,1,2
        Arrays.fill(conjunto3,0,3,200);
        //Rellenamos el Array conjunto3 con 200 en las posiciones 3 y 4
        Arrays.fill(conjunto3,3,5,300);
         for(i=0;i<conjunto3.length;i++){
            System.out.println(conjunto3[i]);
        }
     }

}
