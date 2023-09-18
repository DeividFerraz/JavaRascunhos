/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repita02numeros;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Repita02Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n, s=0;
        int n=0;
        int s=1;
        String resp;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            n = tec.nextInt();
            s+= n; //s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = tec.next();
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores e " + s);
    }
    
}
