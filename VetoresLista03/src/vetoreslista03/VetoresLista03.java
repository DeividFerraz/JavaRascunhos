/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoreslista03;

import java.util.Arrays;

/**
 *
 * @author Pichau
 */
public class VetoresLista03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num[] = {3.5, 1.8, 9, -4.5};
        Arrays.sort(num);
        
        
        for(double i: num){
             System.out.println(i + " ");
    }
  } 
}
