/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Matheus
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome1 = "Fabricio";
       String nome2 = "Fabricio";
       String nome3 = new String("Fabricio");
       String res;
       res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);       
    }
    
}
