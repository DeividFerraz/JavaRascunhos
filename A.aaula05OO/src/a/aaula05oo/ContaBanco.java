
package a.aaula05oo;


public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //metodos personalizados
    
    public void estadoAtual(){
        System.out.println("\n---------------------");
        System.out.println("COnta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC") {
            this.setSaldo(50);
        } else if ("CP".equals(t)){//"equal mesma coisa de gual, so para o java parar debreclamar"
            this.setSaldo(150);
        }
        System.out.println("Sua conta foi aberta!!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() != 0) {
            System.out.println("PARA fechar a conta tire as pendencias");
        } else if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada!!!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {//primeiro peguei o stts atual true/false só vai depositar se for true
            this.setSaldo(this.getSaldo() + v);//dps chamo o metodo especial "setSaldo" com ele consigo add alguma coisa ao meu saldo, ai eu pego meu saldo atual coloco dentro dele
            System.out.println("Deposito feito na conta de: " + this.getDono());// E com meu saldo dentro do setSaldo, agora eu somo ele ao valor que vou colocar dentro de "depositar"
        } else {
            System.out.println("Falho ao depositar");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if(this.getSaldo() >= v){
                //o numero que eu colocar dentro de setSaldo é esse valor - o valor completo do meu saldo
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!!!");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!!!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v=20;
        }
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por! " + this.getDono());
        } else {
            System.out.println("COnta fechada");
        }
    }
    
    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //metodo getter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    
    //metodo setter
    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
