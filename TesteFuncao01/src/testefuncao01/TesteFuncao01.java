/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Pichau
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    // usar o static quando for coloar o metodo dentro do main statici se n da erro
    static int somas(int a, int b){//funçoes como em outras linaguagem
        int s = a + b;
        return s;
    
    
   /* static void soma(int a, int b){//procedimentos
        int s = a + b;
        System.out.println("A soma e " + s);*/
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sm = somas(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
