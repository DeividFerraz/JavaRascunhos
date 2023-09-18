package exemplotrycath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCath {

    public static void main(String[] args) {
        System.out.println("Continuidade do programa");
        method1();
    }
    
    public static void method1(){
        System.out.println("metodo 1 start");
        method2();
        System.out.println("metodo 2 fim");
    }
    
    public static void method2(){
        Scanner sc = new Scanner(System.in);
          try{ //esse Try serve para dar continuidade no programa ainda que haja uma esseção dentro do bloco try ou erro
            String[] vect = sc.nextLine().split(" "); // esse Split quer dizer 
            //que "cada vez que eu der um espaço em branco vai contar um Item dentro do vetor
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inexistente!");
            e.printStackTrace();
            sc.next();
        } catch( InputMismatchException e){
            System.out.println("Erro ao Inserir!");
        }
    }
}
