/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.printf("Sua media foi  " + m + "\n");
        if (m>=9){
            System.out.println("Parabens!!!\nDeivid Ferraz, continue Praticando...");
        }*/
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2023 - nasc;
        if (i >= 18){
            System.out.println("Pode Ir preso!!!");
        } else {
            System.out.println("Nao pode ir preso ainda.");
        }
    }
    
}
