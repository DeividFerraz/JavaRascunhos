/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoreslistas01;

/**
 *
 * @author Pichau
 */
public class VetoresListas01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n0[] = new int[4];/*
             esse metodo é usado quando precisa add itens mais complexos as listas */
        
        int n[] = {3, 6, 5, 4, 8, 2}; // este metodo é usado quando sao pequenos valores
        // vetores"listas" sao objetos, por isso podem ser add metodos 
        System.out.println("total de casas de N " + n.length);
        for (int c=0; c<=n.length; c++){
            System.out.println("na posicao " + c + " temos o valor "  + n[c]);
    }
   } 
}
