/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repita04;

import javax.swing.JOptionPane;
        
        
/**
 *
 * @author Pichau
 */
public class Repita04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola, mundo ", "Boas vindas", JOptionPane.WARNING_MESSAGE);
        int valor,p = 0, t = 0, i = 0, ac = 0, m = 0, s = 0;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>informe um numero: <br> <em>(Valor 0 interrompe)</em>"));
            t+=valor;
            if (valor > 100){
                ac++;
            }
            else if(valor != 0){
                s++;
            }
            if (valor % 2 == 0){
                p++;
            } else {
                i++;
            }
            m = (p + i + ac + s) / 2;
        } while(valor != 0 );
        JOptionPane.showMessageDialog(null, "<html><strong>RESULTADOS</strong>:<hr><br> </html>" +
                "\nSoma de todos os valores: " + t +
                "\nTotal de valores add: " + s + "\nTotal de Pares: " + p + 
                "\nTotal de Impares: " + i + "\nValor Acima de 100: " + ac + 
                "\nMedia dos valores: " + m);
       
   }
}
