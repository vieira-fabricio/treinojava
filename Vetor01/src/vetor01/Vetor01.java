/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Matheus
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,5,7,9,8,2};
        System.out.println("O total de casas do meu vetor é: " +n.length);
        for (int c=0; c<n.length; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
