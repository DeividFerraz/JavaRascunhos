/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.aaula10oo.polimorfismo;

/**
 *
 * @author Pichau
 */
public class AAaula10OOPolimorfismo {

    public static void main(String[] args) {
       // Animal n = new Animal();
       Mamifero m = new Mamifero();
       Repitil r = new Repitil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru k = new Canguru();
       Cachorro c = new Cachorro();
       Cobra co = new Cobra();
       GoldFish g = new GoldFish();
       Tartaruga t = new Tartaruga();
       Arara ar = new Arara();
       
       
       k.locomover();
       c.locomover();
       k.amitirSom();
       c.amitirSom();
       
       
       m.setPeso(75.3f);
       m.setCorPelo("Marrom");
       m.alimentar();
       m.locomover();
       m.amitirSom();
       
       
       a.locomover();
       p.locomover();
       r.locomover();
       m.locomover();
        
       
        System.out.println(m.toString());
    }
    
}
