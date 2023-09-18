/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author Pichau
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=1; cc<4;cc+=1){
            for(int jj=1; jj<3; jj++){
                System.out.println(cc);
            }
     }
        for (int cc = 0; cc<=100; cc+=1 ){
            for(int res=1; res <= 9; res++){
                System.out.println(cc);
            }
        }
        
        for (int cc = 10; cc<=100; cc+=10 ){
            System.out.println(cc);
        }
        
        /* mesam coisa de 
        int cc=0;
        while(cc<4){
              System.out.println("Cambalhota");
              cc++;
        }
        */
        
    }
    
}
