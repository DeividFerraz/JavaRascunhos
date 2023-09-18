package a.aaula04;

/**
 *
 * @author Pichau
 */
public class AAaula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco cc = new ContaBanco(0, false);
        
       
        
        cc.setStatus(true);
        cc.getNumConta();
        cc.depositar();
        cc.getSaldo();
        cc.setTipoCC("corrente");
        cc.getTipoCC();
        cc.abrirConta();
        cc.getSaldo();
        cc.sacar();
        cc.pagarMensal();
        cc.statusT();
        
    }
    
}
