/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoreslista02;

/**
 *
 * @author Pichau
 */
public class VetoresLista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]= {"jan","fer","mar","abr","maio","jun","jul","ago",
            "set","out","nov","dez"};
        
        int dia[]= {31,28,31,30,31,30,31,31,30,31,30,31};   
        int ano = 4;
    
        for(int c=0; c<mes.length; c++){
            System.out.println("O mes de " + mes[c] + " tem " + dia[c] + " dias ao todo");
        }
        
        
    }
     
}
