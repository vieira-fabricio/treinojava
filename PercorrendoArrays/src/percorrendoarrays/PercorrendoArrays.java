/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percorrendoarrays;

/**
 *
 * @author Matheus
 */
public class PercorrendoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arrayNumero = {10,8,6,89,40,22,33,11,12};
        int total = 0;
        //Adiona valor no objeto total
           for (int i: arrayNumero)
           total += i;
        System.out.println("Total de elementos arrayNumero: %d/n "+total);
    }
    
}
