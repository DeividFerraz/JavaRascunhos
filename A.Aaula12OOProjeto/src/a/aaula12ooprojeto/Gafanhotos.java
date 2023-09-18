/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula12ooprojeto;

/**
 *
 * @author Pichau
 */
public class Gafanhotos extends Pessoa{
    private String login;
    private int totalAssistido;
    
    
    //Construtor da classe pessoa adpatado, a classe pessoa é a super classe
    public Gafanhotos(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    
    //metodos especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {// Ao colocar super estou colocando o to.string da classe pessoa aqui
        return "Gafanhotos{" + super.toString() + "login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
    
}
