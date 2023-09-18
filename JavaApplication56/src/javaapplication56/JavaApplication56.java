/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication56;

import java.util.Scanner;

class MarcasEsporte{
    String esporte;
    
    
    
    MarcasEsporte(String esporte){
        this.esporte = esporte;
   
        
    }
    
    void mostrarMarca(){
        
        System.out.println("Roupas esportivas escolhidas: " + esporte);
    }  

    void mostrarMarcaC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class MarcasCasual{
    String casual;
  
    
    MarcasCasual(String casual){
        this.casual = casual;
      
        
    }
    
    void mostrarMarcaC(){
        System.out.println("Roupas Casuais escolhidas: " + casual);
    }
}


public class JavaApplication56 {
    
    static final int TAMANHOMAXIMO = 30;
    static MarcasEsporte[] pecas = new MarcasEsporte[TAMANHOMAXIMO];
    static MarcasCasual[] pecas1 = new MarcasCasual[TAMANHOMAXIMO];
    static int quantidadePecas = 0;
    static int quantidadePecas1 = 0;
    static Scanner item = new Scanner(System.in);
    
    static void escolhaEsporte(){
        if(quantidadePecas >= TAMANHOMAXIMO){
            System.out.println("Nao pode mais add itens, Melhore a estrutura!");
            return;
        }
        
        
        System.out.println("\nDigite os nomes das camisas que deseja comprar.");      
        String esporte = item.nextLine();
      
        
        
        MarcasEsporte opcaoadd = new MarcasEsporte(esporte);
        pecas[quantidadePecas++] = opcaoadd;
        
    }
    
    static void escolhaCasual(){
        if(quantidadePecas1 >= TAMANHOMAXIMO){
            System.out.println("Nao pode mais add itens, Melhore a estrutura!");
            return;
        }
         
        
        System.out.println("\nDigite os nomes das 5 opcoes de camisas que deseja comprar.");
        String casual = item.nextLine();
       
     
        MarcasCasual opcaoadd1 = new MarcasCasual(casual);
        pecas1[quantidadePecas1++] = opcaoadd1;
    }

    static void verOpcaoEscolhida(){
        
        for(int i = 0; i < quantidadePecas; i++){
            System.out.println("----"); 
            pecas[i].mostrarMarca();
            
        }
    }
    static void verOpcaoEscolhida1(){
        
        for(int i = 0; i < quantidadePecas1; i++){
            System.out.println("----"); 
            pecas1[i].mostrarMarcaC();
            
        }
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            System.out.println("\nO que voce quer aqui ?");
            System.out.println("1 - Add a sacola Opcoes de vestimentas ESPORTIVAS");
            System.out.println("2 - Add a sacola Opcoes de vestimentas CASUAIS");
            System.out.println("3 - Ver o que eu escolhi esporte");
            System.out.println("4 - Ver o que eu escolhi casual"); 
            System.out.println("5 - Sair");
            
            int opcoes = item.nextInt();
            item.nextLine();
            
            switch (opcoes) {
                
                case 1:
                    escolhaEsporte();
                break;
                 
                case 2:
                    escolhaCasual();
                break;
                
                case 3:
                    verOpcaoEscolhida();
                break;
                
                case 4:
                    verOpcaoEscolhida1();
                break;
                
                case 5:
                    return;
                    
                default:
                    System.out.println("Error 404");
            }
            
        }
    }
    
}
