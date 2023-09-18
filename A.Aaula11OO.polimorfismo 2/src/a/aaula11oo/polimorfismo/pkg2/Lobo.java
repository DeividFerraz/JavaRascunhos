/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula11oo.polimorfismo.pkg2;

/**
 *
 * @author Pichau
 */
public class Lobo extends Mamifero{
    //Aqui foi usado o Polimorfismo de sobre posição, que é a mesma assinatura em classes diferentes.
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuuuuuuu!");
    }
    
}
