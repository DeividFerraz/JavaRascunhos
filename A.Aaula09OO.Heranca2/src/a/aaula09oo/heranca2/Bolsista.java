/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula09oo.heranca2;

/**
 *
 * @author Pichau
 */
public class Bolsista extends Aluno{ //a classe deu erro pois a classe aluno esta como final, e é usada nas classe quando nao queremos que as classes tenham filhos assim tambem serve para metodos.
    private float bolsa;
    
    public void renovaBolsa(){
        System.out.println("Renova bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){ // agr deu erro por que em aluno eu disse que "pagar mensalidade" é um metodo final
        System.out.println(this.getNome() + " é bolsita");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
