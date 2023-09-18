package zprojetocontabancooo02;

public class Account {
    //atributos
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //construtor
    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    
    //GetterEsetters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
     //metodos especiais
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        validationWithDraw(amount);
        balance -= amount;
    }
    
    
    // dentro da classe BusinnesExcepiton eu colocaquei uma super(msg) com extenção da classe runtime, agr eu add a clase BusinnesExcepiton duas strings de erro
    //agr sempre que der algum erro, é só eu chamar a classe BusinnesExcepiton que ele ja vai mostrar a excessao.
    void validationWithDraw(double amount){//caso a primeira regra seja quebrada, lançar uma excessao
        if (amount > getWithdrawLimit()) {
            throw new BusinnesExcepiton("Erro de saque: A quantia excede o limite de saque");
            //o throw assim como o return ele corta o metodo
        }
        if  (amount > getBalance()){
            throw new BusinnesExcepiton("Erro de saque: Saldo insuficiente");
        }
    }
}
