/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somasimples;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class SomaSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A, B;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        A = teclado.nextInt();
        System.out.println("Digite outro número: ");
        B = teclado.nextInt();
        int X = A + B;
        System.out.println(X);
    }
    
}
