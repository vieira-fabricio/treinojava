/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Matheus
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {2.5, 3.4, 5.3, 9.5};
        Arrays.sort(v);
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
