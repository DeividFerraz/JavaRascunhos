/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author Pichau
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)*2;
        /* na matematica os operadores de DIVISAO, MULTIPLICACAO,
        SUBTRACAO, RESTO DE DIVISAO E ELEVACAO, sao feitos primeiro
        que a SOMA por isso se quiser somar primeiro precisa, 
        colocater entre parenteses.
        */
        System.out.println("Resultado: " + m);
        
        /*int numero= 10;
        int valor = 5 + ++numero;
        int valor2 = 6 + numero;*/
        
        
        /* se o "++" for dps do "numero" o numero so vai voltar a
        valer 6 na proxima operacao usando a variavel numero.
        no caso seria um POS ICREMENTO.  e ali eu fiz um PRE INREMENTO.
         por isso aparecu junto ja a soma.
        */
        
        /*System.out.println(valor2);
        System.out.println(numero);*/
        
        //Operadores aritmeticos de atribuiçao.
        int x = 4;
        x += 5; // x = x + 2
        System.out.println(x);
        
        //operador de arredondamento com a classe MATH.
        float v = 8.3f;
        //int ar = (int) Math.floor(v); //ar para baixo
        //int ar = (int) Math.ceil(v); // ar para cima
        int ar = (int) Math.round(v); //ar para o mais prximo
        System.out.println(ar);
        
        //Gerador de numeros com math.
        double ale = Math.random();
        int n = (int)(15 + ale * (50 - 15));
        System.out.println(n);
    }
    
}
