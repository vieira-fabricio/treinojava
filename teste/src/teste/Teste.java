/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Locale;

/**
 *
 * @author Matheus
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Locale loc=Locale.getDefault();
        System.out.println(loc.getLanguage());
        System.out.println(loc.getDisplayLanguage());
        
    }
    
}
