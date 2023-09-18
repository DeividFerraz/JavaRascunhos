
package a.aaula05oo;


public class AAaula05OO {

    
    public static void main(String[] args) {
        
        ContaBanco p1 =new ContaBanco();
        p1.setNumConta(6785);
        p1.setDono("deivid");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2456);
        p2.setDono("Anan rubia");
        p2.abrirConta("CP");
        
        p1.depositar(329);
        p2.depositar(427);
        
        p2.sacar(129);
        p1.sacar(400);
        
        p1.sacar(379);
        p1.fecharConta();
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
