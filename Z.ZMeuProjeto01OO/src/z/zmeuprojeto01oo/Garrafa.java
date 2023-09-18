
package z.zmeuprojeto01oo;

import java.util.Scanner;


public class Garrafa {
    
    Scanner sc = new Scanner(System.in);
    
    String modelo;
    String cor;
    int capacidade;
    int cheia;
    String material;
    String aberta;
    String cheia1;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da garrfa: " + this.cor);
        System.out.println("Capacidade Maxima: " + this.capacidade);
        System.out.println("Vazia, metade ou cheia?: " + this.cheia1);
        System.out.println("material da garrafa: " + this.material);
        System.out.println("Status da garrafa: " + this.aberta);
        
    }
    
    
    void modelo(){
        System.out.print("O modelo da garrafa é: ");
        this.modelo = sc.nextLine();
    }
    
    void cor(){
        System.out.print("A cor da garrafa é: ");
        this.cor = sc.nextLine();
    }
    
     void abertudaoufechada(){
        System.out.print("A garrafa esta aberta ou fechada ? "); 
        
    }
     
     
     //gambiarra perigo
    void enchida2(){
        System.out.print("Quanto de agua tem em ML ? ");
    }
    void enchida(){
        
        if(this.cheia >= 600 || (this.cheia >=700 && this.cheia <1000)){
            this.cheia1 = "cheia!";
        } else if(this.cheia >= 300 || (this.cheia >= 400 && this.cheia <600 )){
            this.cheia1 = "pela metade!";
        } else if (this.cheia < 300){
            this.cheia1 = "vazia!";
        }
        this.cheia1 = "A garrafa esta " + this.cheia1;
    }
    // gambiarra acima
    
    
    
    void capacidade1(){
        System.out.print("Qual a capacidade Maxima em ML da garrafa?");
        this.capacidade = sc.nextInt();
    }
    
    void materia1(){
        System.out.print("Qual materias da garrafa? ");
        this.material = sc.nextLine();
    }
    
   

}
