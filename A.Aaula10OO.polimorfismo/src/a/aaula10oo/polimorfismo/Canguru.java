/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula10oo.polimorfismo;

/**
 *
 * @author Pichau
 */
public class Canguru extends Mamifero{
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
      @Override
    public void amitirSom() {
        System.out.println("Chora");
    }
}
