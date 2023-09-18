/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.aaula11oo.polimorfismo.pkg2;

/**
 *
 * @author Pichau
 */
public class AAaula11OOPolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal x = new Animal();
        //Lobo x = new Lobo();
        Cachorro x =  new Cachorro();
        
        x.reagir("Ola");
        x.reagir(11,45);
        x.reagir(false);
        x.reagir(15, 00);
        x.emitirSom();
    }
    
}
