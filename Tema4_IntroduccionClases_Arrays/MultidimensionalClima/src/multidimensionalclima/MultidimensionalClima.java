/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalclima;
/**
 *
 * @author COOLBOX_SSD5
 */
public class MultidimensionalClima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] climas={{"�vila","Burgos","Le�n", "Palencia","Salamanca","Segovia","Soria","Valladolid","Zamora"},
            {"10�C","10�C","11�C","12�C","12�C","12�C","11�C","12�C","13�C"},
            {"1130m","890m","916m","758m","790m","1005m","1082m","735m","656m"}};
        System.out.println(climas[0][5]+" "+ climas[1][5]+ " " + climas[2][5]);
        System.out.println(climas[0][7]+" "+ climas[1][7]+ " " + climas[2][7]);
    }
    
}
