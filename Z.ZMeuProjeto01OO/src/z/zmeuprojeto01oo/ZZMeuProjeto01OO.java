package z.zmeuprojeto01oo;

import java.util.Scanner;
public class ZZMeuProjeto01OO {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Garrafa g1 = new Garrafa();
        
        g1.modelo();
        
        g1.cor();
        
        g1.materia1();
        
        g1.capacidade1();
        
        g1.abertudaoufechada();
        g1.aberta = sc.nextLine();
        
        //gambiarra perigo
        g1.enchida2();
        g1.cheia = sc.nextInt();
        g1.enchida();
     
        g1.status();
        
    }
    
}
