/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIAR UM ARRAY LIST  
        ArrayList al = new ArrayList();
        System.out.println("Tamanho inicial do al " +al.size());
        //Adicionar elementos a lista Array
              al.add("Banana");
              al.add("Manga");
              al.add("Morango");
              al.add("Uva");
              al.add("Abacaxi");
              al.add("Acerola");
              al.add(1,"Abacate");
        System.out.println("O tamanho atual do al é "+al.size());
        //Mostra conteúdo do Array
        System.out.println("Conteúdo do al" +al);
        //Remore elementos do Array
              al.remove("Acerola");
              al.remove(2);
        System.out.println("Tamanho do al após remoções " +al.size());
        System.out.println("Conteúdo do al " +al);
        
    }
    
}
