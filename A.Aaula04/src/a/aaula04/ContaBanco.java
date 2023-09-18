/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ContaBanco {
    Random random = new Random();
    
    

    Scanner sc = new Scanner(System.in);
    
    public int numConta;
    protected String tipoC;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
        this.numConta = random.nextInt(100000); // gera um número inteiro aleatório entre 0 e 99
    }

    //getter
    public int getNumConta() {
        return numConta;
    }

    public String getTipoCC() {
        return tipoC;
    }
    
    public String getTipoCP() {
        return tipoC;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
   
    
    
    
    //Setter
    public void setNumConta(double numConta) {
        this.numConta = 0;
    }

    public void setTipoCC(String CC) {
        this.tipoC = CC;
    }
    
    public void setTipoCP(String CP) {
        this.tipoC = CP;
    }
    
 
    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = 0;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if(this.status == true){
            System.out.println("Sua conta foi aberta, voce ira ganhar de 10% a 15% do valor que deposita");
        } else {
            System.out.println("CONTA FECHADA!!!");
        }
    }
    
    
    //metodos
    public void abrirConta(){
        if(this.status == true && this.tipoC == this.getTipoCC()){
            double valor = this.getSaldo(); // valor original
            double porcentagem = 0.1; // 10% expresso como uma fração decimal
            double resultado = valor * porcentagem; // cálculo do valor da porcentagem
            this.saldo+=resultado;
            System.out.println("Conta Aberta Voce esta com " + this.saldo + " Reais");
        } else if (status == true && this.tipoC == this.getTipoCP()){
            double val = this.getSaldo(); // valor original
            double por = 0.15; // 15% expresso como uma fração decimal
            double res = val * por; // cálculo do valor da porcentagem
            this.saldo+=res;
            System.out.print("Conta Aberta voce esta com" + this.saldo + " Reais");
        }
    }
    
    public void fecharConta(){
        if(this.saldo != 0){
            System.out.println("ERROR!, Verifique se não a saldo ou debitos!"); 
        } else{
            System.out.println("Conta fechada!!!");
            this.status = false;
        }
    }
    
    public void depositar(){
        System.out.print("Quantos voce quer depositar ?");
            double dep = sc.nextDouble();
        if(this.status == true){
            this.saldo+=dep;
        } else {
            System.out.println("sua conta esta fechada!!!");
        }
    }
    
    public void sacar(){
        System.out.print("Quanto você quer sacar ? ");
        double sac = sc.nextDouble();
        if(sac == 0){ 
            System.out.println("Voce nao sacou nada");
        } else if(this.status == true && this.saldo >= sac){
            System.out.println("Saque feito com sucesso");
            this.saldo-=sac;
        } else {
            System.out.println("Você não tem saldo o suficiente!!!");
        }
    }
    
    public void pagarMensal(){
        if(this.status == true && this.tipoC == this.getTipoCP()){
            int valor = 20;
            this.saldo-=valor;
            System.out.println("Mensalidade poupanca: -" + valor);
        } else if (this.status == true && this.tipoC == this.getTipoCC()){
            int val = 12;
            this.saldo-=val;
            System.out.println("Mensalidade corrente: -" + val);
        }
    }
    
    public void statusT(){
        System.out.println("\n \n \nSeu numero de conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.tipoC);
        System.out.println("Seu saldo é: " + this.getSaldo());
        
    }
}
