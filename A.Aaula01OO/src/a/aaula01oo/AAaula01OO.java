

package a.aaula01oo;
public class AAaula01OO {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Pitu";
        c2.cor = "amarelo";
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
        
        
    }
    
}
