/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula10oo.polimorfismo;

/**
 *
 * @author Pichau
 */
public class Peixe extends Animal{
    
    private String corPeixe;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void amitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    public String getCorPeixe() {
        return corPeixe;
    }

    public void setCorPeixe(String corPeixe) {
        this.corPeixe = corPeixe;
    }
    
    
}
