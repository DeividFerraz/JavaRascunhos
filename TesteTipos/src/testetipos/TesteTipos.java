/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Pichau
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        /* String valor = idade. Este modo ou o typecast seriam incorrretos 
        pois tem conflitos na hora de executar ao tentar tranformar um interio em string,
        o modo correto é usar uma classe involucro(wrapperclass) com o metodo".toString" que transforma
        um numero em "letra" String
        */
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        /* agora vamos fazer a mesma coisa porem ao contrario.
        tranformar String em um valor.
        */
        String Numero = "30";
        int agrENumero = Integer.parseInt(Numero);
        System.out.println(agrENumero);
        /* tambem podemos fazer com o tipo float e ficarua assim
        
        */
         String Numeros = "30.5";
        float agrENumeros = Float.parseFloat(Numeros);
        System.out.printf("%.3f\n", agrENumeros);
        
        
    }
    
}
