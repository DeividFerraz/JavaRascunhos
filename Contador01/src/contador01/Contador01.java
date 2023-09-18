/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Pichau
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int cc = 1;
       /* while (cc <= 4) {
            System.out.println("cambalhota " + cc);
            cc = cc + 1;
    }*/ int cc = 0;
    while (cc < 10){
        cc++;
        if (cc == 5 || cc == 7 || cc == 9){
            continue;
            
        } if (cc==7){
            break;
        }
        System.out.println("cambalhota " + cc);
    }
  }  
}
