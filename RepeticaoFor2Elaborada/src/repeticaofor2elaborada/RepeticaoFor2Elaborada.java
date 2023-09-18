package repeticaofor2elaborada;

import java.util.Scanner;

public class RepeticaoFor2Elaborada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];
        
        for(int i=0; i<n; i++){
            System.out.println("dados da " + (i+1) + " pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma = soma + altura[i];
        }
        double mediaAltura = soma / n;
        System.out.println();
        System.out.printf("Altura media: %.2f%n", mediaAltura);
        
        int count = 0;
         for(int i=0; i<n; i++){
             if(idades[i] < 16){
                 count++;
            }
        }
         
        double percent = count * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        
        for(int i=0; i<n; i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
        
    }
    
}
