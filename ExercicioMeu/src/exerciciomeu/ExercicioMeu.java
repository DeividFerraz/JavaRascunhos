/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciomeu;

import java.util.Scanner;


/**
 *
 * @author Pichau
 */
public class ExercicioMeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int Esporte = 1 ;
        
        System.out.println("Loja De Roupa Escolha seu Estilo:");
        System.out.print("Alternativas:\n 1 - Esporte ou   2 - Casual ? ");
        
        int r = tec.nextInt();
        if (r == Esporte) {
            System.out.println("Leblom DOUZI: 399$\n" + "Nike air max 90: 299$\n" + "Camisa Fit: 59,90$\n" + "Calça Slin HayrCut: 599$");
        } else {
            System.out.println("\nCamisa for Nigth: 119,90$\n" + "Sapato cousa MOD(Sapatenis): 199$\n" + "Camisa Social(HOME): 59.90$\n");
        }
       
    }
}