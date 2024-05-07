/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_41;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] climas={{"Ávila","Burgos","León", "Palencia","Salamanca","Segovia","Soria","Valladolid","Zamora"},
            {"10","10","11","12","12","12","11","12","13"},
            {"1130","890","916","758","790","1005","1082","735","656"}};
        //Obtener temperatura más alta
        
        int posmax=0;//Esta variable la declaro para almacenar la posición del Array en la que se encuentra
        int n=0;//Esta variable la uso como contador del bucle mostrando en que número del bucle está
        int max=Integer.parseInt(climas[1][0]);//Aquí asigno como valor máximo al primer valor para luego meterlo en un if
        for(String maxTemperatura:climas[1]){
            //Ahora digo que si hay algún número mayor al asignado me transorme el anterior a ese valor
           if(Integer.parseInt(maxTemperatura)>max){
               max=Integer.parseInt(maxTemperatura);
               posmax=n;
           }
           n++;
            
        }
        System.out.println("La temperatura más alta es: ");
        System.out.println(climas[0][posmax]+" "+max);
        
        //Obtener temperatura más baja
        int posmin=0;
        int m=0;
        int min=Integer.parseInt(climas[1][0]);//Le asigno el primer valor a la mínima
        for(String minTemperatura:climas[1]){
            if(Integer.parseInt(minTemperatura)<min){
                min=Integer.parseInt(minTemperatura);
                posmin=m;
            }
            m++;
      
        }
        System.out.println("La temperatura más baja es: ");
        System.out.println(climas[0][posmin]+" "+min);  
        
        //Obtener capital con la altura mayor
        int pos=0;
        int i=0;
        int maxAltura=Integer.parseInt(climas[2][0]);
        for(String maxAlt:climas[2]){
            if(Integer.parseInt(maxAlt)>=maxAltura){
                maxAltura=Integer.parseInt(maxAlt);
                pos=i;
            }
            i++;
        }
        System.out.println("La ciudad con la altura máxima es: ");
        System.out.println(climas[0][pos]+" "+maxAltura);
        //Obtener capital con altura menor
        int posMin=0;
        int j=0;
        int minAltura=Integer.parseInt(climas[2][0]);
        for(String minAlt:climas[2]){
            if(Integer.parseInt(minAlt)<minAltura){
                minAltura=Integer.parseInt(minAlt);
                posMin=j;
            }
            j++;
        }
        System.out.println("La altura mínima es:");
        System.out.println(climas[0][posMin]+" "+minAltura);
        //Obtener temperatura media
        int contador=0;
        int suma=0;
        for(String temperatura:climas[1]){
            suma+=Integer.parseInt(temperatura);
            contador++;
        }
        double tempMedia=(double)suma/(double)contador;
        tempMedia=((int)(tempMedia*100.))/100.;
        System.out.println("La temperatura media es:  " + tempMedia);
        
        //Obtener altura media
        int contador2=0;
        int sum=0;
        for(String altura:climas[2]){
            sum+=Integer.parseInt(altura);
            contador2++;
        }
        double altMedia=(double)sum/(double)contador2;
        altMedia=((int)(altMedia*100.))/100.;
        System.out.println("La temperatura media es:  " + altMedia);
    }
    
}
