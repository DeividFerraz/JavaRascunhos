/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas Pernas ? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso e um(a) ");
        switch(perna){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipedis";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET ";
    }
        System.out.print(tipo);
    }
    
}
