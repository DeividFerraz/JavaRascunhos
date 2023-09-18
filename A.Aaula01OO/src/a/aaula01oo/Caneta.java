
package a.aaula01oo;
//this é o objeto que cria fora da classe, e esse objeto criado, quando ele chama algum atributo dentro da classe, é usado o this, entao this é o objeto que chamou dentro da classe

public class Caneta {
    //Aqui vao nossos atributos, enato coloquei 5 atributos que eu posso usar e la embaixo 3 metodos. atributo nao tem parenteses dps
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //void chamamos de metodos, pois eles nao comntem retorno. Metodos tem parenteses dps.
    void status(){
        
        //This. é uma referencia ao proprio obejeto q o chama, no caso o c1 é quem chama, entao sempre que colocar this é coo se estivesse colocando o c1
        
         System.out.println("Uma caneta " + this.cor);
         System.out.println("Esta tampada? " + this.tampada);
         System.out.println("MOdelo: " + this.modelo);
         System.out.println("POnta: " + this.ponta);
         System.out.println("Carga: " + this.carga);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! nao posso rabiscar");
            
        } else {
            System.out.println("Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
}
