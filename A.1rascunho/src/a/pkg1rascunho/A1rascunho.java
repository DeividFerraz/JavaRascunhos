/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.pkg1rascunho;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class A1rascunho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int soma= 0;
        //for()
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            soma+=x;
        }
        System.out.println(soma);
       /* while (soma< 10){
           soma++;
            System.out.println(soma);
        }
        
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metro = sc.nextDouble();
        
        double area = largura * comprimento;
        double preco = area * metro;
        
        System.out.printf("AREA = %.2f\n" + area);
        System.out.printf("pRECO = %.2f\n" + preco);
        sc.close();*/
   }
}
