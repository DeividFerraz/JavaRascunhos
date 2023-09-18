
package a.aaula04oo;


public class Caneta {
    private String nomeCaneta;
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    
    
    /*public Caneta(){ //este é o metodo construtor, mesmo nome da classe. ja vem falando q esta tampada e que é azul
        this.tampar();
        this.cor = "azul";
    }*/
    //tudo eu que fiz
    public Caneta(String n, String m, String c, float p){
        this.setNome(n);
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public String getNome(){
        return nomeCaneta;
    }
    
    public void setNome(String n){
        this.nomeCaneta = n;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    //estrategia para usar um atributo privado, no caso "ponta" metodo assessor
    public void setPonta(float p){
        this.ponta = p;
    }
   
    public String getCor(){
        return cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: " + this.getNome());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("tampada: " + this.tampada);
    } 
}
