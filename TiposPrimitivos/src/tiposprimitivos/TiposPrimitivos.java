/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);//system.in é a entrada do disposito
          // ou seja é o input, Scanner é a classe que preciso importar para conseguir escrever,
          // no terminal. Aqui Foi usada o Wrapperclass, que serve para Criar um objeto, ou seja o teclado.
          /* Para entendr melhor um objeto pode ser usado como uma caixa vazia usado para armazenar algum valor
          na hora de introduzir na variavel. no meu caso essa "caixa vazia" nao representava
          valor algum enato eu coloquei um valor lena usando o "nextLine" para add uma string
          e o "nextFloat" para add um numero quebrado.
          */
        System.out.print("Digite o nome do aluno: ");
          String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        //String nome = "Deivid";
        //float nota = (float)8.5;
        System.out.printf("A nota de %s %.2f\n ", nome, nota);
        /* A %f com numero no meio é apenas para add mais numeros ao final da casa desse mal.
        \n para pular linha.
        E %s é para adicionar o nome a string sem precisar concatenar.
        */
    }
    
}
