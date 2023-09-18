/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprojeto;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class MeuProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criando objeto.
        Scanner tec = new Scanner(System.in);
        
        //Criando Variaveis 
        float a = 0, l = 0, c = 0;
        
        //sout
       
        do {
             System.out.println("Para Prosseguir responda as perguntas a seguir: ");
            System.out.print("Qual altura do veiculo? ");
            a = tec.nextFloat();
            System.out.print("Qual largura do veiulo? ");
            l = tec.nextFloat();
            System.out.print("Qual comprimento do veiulo? ");
            c = tec.nextFloat();
            if(a >= 2.30 ){
                System.out.println("Acesso negado!!!\nVeiulo nao cumpre com as especificacoes da portaria");
            }
        } while(a >= 2.30 || l >=  1.15 || c >= 8.40);
        System.out.println("Acesso Permitido.");
        
        System.out.println("Dados do Veiculo cadastrado: \n" + "Altura - " + a);
        System.out.println("Largura - " + l);
        System.out.println("Comprimento - " + c);
      
    }
    
}


/* Que tal um projeto para calcular o volume de um conjunto de objetos escaneados por um scanner?

O programa pode ser estruturado da seguinte forma:

1 - Solicite ao usuário quantos objetos ele deseja escanear.
2 - Crie um loop while que execute até que o número de objetos 
escaneados seja igual ao número solicitado pelo usuário.
3 - Dentro do loop, solicite ao usuário as dimensões do objeto 
a ser escaneado (por exemplo, altura, largura e comprimento).
4 - Use operadores aritméticos para calcular o volume do objeto 
escaneado.
5 - Utilize uma estrutura condicional if para verificar se o 
volume do objeto é maior que um certo valor. Se sim, exiba uma 
mensagem de alerta.
6 - Repita o loop até que todos os objetos tenham sido escaneados.
7 - Exiba uma mensagem com o volume total dos objetos escaneados.


Esse projeto exigirá uma boa dose de lógica e habilidades em 
programação em Java. Ele envolve a utilização de loops, estruturas 
condicionais, operadores aritméticos e entrada e saída de dados, 
o que o torna um bom exercício para praticar conceitos fundamentais 
da linguagem.*/