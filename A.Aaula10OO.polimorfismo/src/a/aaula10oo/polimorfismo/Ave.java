/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula10oo.polimorfismo;

/**
 *
 * @author Pichau
 */
public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer fruta");
    }

    @Override
    public void amitirSom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construir ninho");
    }
}
