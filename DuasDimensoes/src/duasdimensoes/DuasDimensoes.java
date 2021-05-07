/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duasdimensoes;

/**
 *
 * @author Matheus
 */
public class DuasDimensoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       int DuasDimensoes [ ] [ ] = new int [4] [5];
       int i, j, k = 0;
           for (i = 0; i < 4; i ++)
              for (j = 0; j < 5; j++) {
                 DuasDimensoes [i] [j] = k;
                  k++;
                }
           
            for (i = 0; i < 4; i ++) {
               for (j = 0; j < 5; j++) {
               System.out.print (DuasDimensoes [i] [j] +" ");
             
              }
        }
    }
}
