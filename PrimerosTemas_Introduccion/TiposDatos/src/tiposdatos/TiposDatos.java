/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

/**
 *
 * @author CoolBoxSSD4
 */
public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isReal;
        isReal= true;
        byte d =122; //Deben ser inferiores a 127
        short e = -29000; //Deben ser inferiores a 32767
        int f = 100000; //Deben ser inferiores a 2100 mill.
        long g = 999999999999L; //Se debe poner L al final
        float h = 234.99F; //Debe ser <3E38 y con F al final
        double i = 55E100;
        char cvalue = '4'; //char '4' no es un entero
        String emperador = "Claudio";
        System.out.println("Datos booleanos: " + isReal);//Salida concatenada entre comillas
        System.out.println("Datos byte: " + d);
        System.out.println("Datos entero short: " + e);
        System.out.println("Datos Entero Long " + g);
        System.out.println("Datos decimal simple: " + h);
        System.out.println("Datos entero: " + f);
        System.out.println("Datos Decimal Double " + i);
        System.out.println("Datos Carácter: " + cvalue);
        System.out.println("Datos cadena de caracteres: " + emperador);
        //Prueba de caracteres especial unicode
        System.out.println("Caracter especial unicode\n\"Con salto de linea y marcando la linea entre comillas\"");
    }
    
}
