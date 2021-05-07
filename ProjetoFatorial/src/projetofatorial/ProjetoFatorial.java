/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofatorial;

/**
 *
 * @author Matheus
 */
public class ProjetoFatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int f = 1;
        int c = n;
           while (n >=1) {
              c = c*f;
              c --;
        }
        System.out.println(f);
        
        
        
        
    }

    private static void settext(String digite_um_número_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
