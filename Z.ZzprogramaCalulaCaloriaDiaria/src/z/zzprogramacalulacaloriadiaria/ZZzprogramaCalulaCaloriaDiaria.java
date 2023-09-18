package z.zzprogramacalulacaloriadiaria;

import java.util.Scanner;

public class ZZzprogramaCalulaCaloriaDiaria {

    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        
        int n1 = 66;
        float n2 = 13.7f;
        int n3 = 5;
        float n4 = 6.5f;        
        
        System.out.println("--------------------");
        System.out.print("Coloque seu peso em kg: ");
        int inputPeso = peso.nextInt();
        System.out.print("\nColoque Sua altura em cm: ");
        int inputAltura = peso.nextInt();
        System.out.print("\nColoque sua idade: ");
        int inputIdade = peso.nextInt();
        
        float res = n1 + (n2 * inputPeso) + (n3 * inputAltura) - (n4 * inputIdade);
        System.out.println("Voce perde " + res + " Calorias Em Repouso!!!");
        System.out.println("--------------------");
        
    }
    
}
