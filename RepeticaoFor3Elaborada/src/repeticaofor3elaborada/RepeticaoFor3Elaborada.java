/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor3elaborada;

/**
 *
 * @author Pichau
 */
public class RepeticaoFor3Elaborada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] vec = new String[] {"Maria", "Mario", "Joao"};
        
        for(int i = 0; i<vec.length; i++){
            System.out.println(vec[i]);
        }
        for(String obj :vec){//Para cada intem obj dentro do vetor me mostre ele, esse for percorre cada obj dentro de vec
        System.out.println(obj);
    }
    }
}
