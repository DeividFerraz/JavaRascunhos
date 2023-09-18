
package a.aaula04oo;


public class AAaula04OO {

 
    public static void main(String[] args) {
       
        Caneta c2 = new Caneta("Pekisview", "Nic", "Amarela", 0.4f);
        //metodo construtor faz com que os atributos ja comecem com um valor.
        //no caso ja vem dizendo que esta tampada "true", e ja ve azul.
        c2.status();
        
        Caneta c3 = new Caneta("Cachrro louco", "bic", "Azul", 0.7f);
        c3.status();
        
        //SETTER paara passar um parametro
        c2.setCor("ROXO");
        //para pegar e chamar
        System.out.println(c2.getCor()); 
        
        
        
       /* Caneta c1 = new Caneta();
        c1.setModelo("Bic cristal");
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5;
        
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de ponta " + c1.getPonta());
        c1.status();*/
       
       
    }
    
}
