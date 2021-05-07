/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int media, num, soma = 0; 
        int totVal = 0;
        int nPar = 0;
        int nImpar = 0;
        int mCem = 0;
        do {
          num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                  "<html>Informe um número: <br><em>(Valor 0 interrompe)</html>"));
          soma += num;
          if (num % 2 == 0) {
              nPar ++;
          } else {
              nImpar ++;
          }
          if (num > 100) {
              mCem ++;
          }
          if (num != 0) {
              totVal ++;
          }
        } while (num != 0);
          media = soma/totVal;
           //Saida de Valores
          JOptionPane.showMessageDialog(null, "<html>---------------------------------"
                + "<br>Resultado <br> ---------------------------------" 
                + "<br>Total dos valores: "+ totVal + "<br>"  
                + "Total de númeors pares: " + nPar + "<br>" 
                + "Total de númeors Impares: " + nImpar + "<br>" 
                + "Números acima de 100: " + mCem + "<br>" 
                + "Média dos valores: " + media + "<br>"  
                + "---------------------------------</html>");
        }
    }