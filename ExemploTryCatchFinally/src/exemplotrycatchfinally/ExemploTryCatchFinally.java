/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplotrycatchfinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ExemploTryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\Windows\\Temp\\in.txt");//esse File serve para acessar uma pasta da minha maquina
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error ao abir a pasta: " + e.getMessage());
        } finally {
            if(sc != null) {
                sc.close();
            }
            System.out.println("Finally executado");
        }
    }
    
}
