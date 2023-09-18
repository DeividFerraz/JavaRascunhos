package exercicioooematriz02;

import java.util.Scanner;

public class ExercicioOOeMatriz02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // para fazer um arranjo bidimensional, é aberto os colchetes 2x se fosse tridmensional, era baerto 3x. isso é uma matriz(Vetor de vetores)
        // um colchete é linhas e o outro coluna
        int [][] mat = new int[n][n];
        //for feito para percorrer a matriz
        for(int i =0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
               mat[i][j] = sc.nextInt();
            }
        }
        //for para ver os numeros diagonal
        System.out.print("Numeros da diagonal: ");
        for(int i = 0; i <mat.length; i++){
            System.out.print(mat[i][i] + " ");
            
        }
        System.out.println();
        //for para ver o total de numeros negativos
        int num = 0;
        for(int i =0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] < 0 ){
                   num++;
                }
            }
        }
        System.out.println("Numeros negativos: " + num);
    }
    
}
  