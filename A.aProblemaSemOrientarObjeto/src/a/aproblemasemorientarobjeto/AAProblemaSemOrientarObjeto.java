/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.aproblemasemorientarobjeto;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class AAProblemaSemOrientarObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xC) * (p - xC));
        
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yC) * (p - yC));
        
        System.out.printf("Triangulo X area %.4f\n", areaX);
        System.out.printf("Triangulo Y area %.4f\n", areaY);
        
        if(areaX > areaY){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
         
        
    }
    
}
