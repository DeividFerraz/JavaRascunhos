/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoreslista04;

import java.util.Arrays;

/**
 *
 * @author Pichau
 */
public class VetoresLista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int i:vet){
            System.out.println(i);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1); //isso quer dizer "dentro da lista vet ache o numero um"
        System.out.println("Encontrei o valor na posicao " + p);
    }
    
}
