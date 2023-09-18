/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Pichau
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Guatavo";
        String nome2 = "Guatavo";
        String nome3 = new String("Guatavo");
        String res;
        //Como "String" cria um obejeto enato o nome1 é um obejto
        //assim como os outros usei o metodo "EQUALS" PARA comparar
        //se o que esta dentro da String é igual. pois por usar 
        //o new a linguagem acaba entendendo que é diferente e o
        // equals fala para a linguagem que é igual
        res = (nome1.equals(nome3))?"Igual":"diferente";
        System.out.println(res);
    }
    
}
