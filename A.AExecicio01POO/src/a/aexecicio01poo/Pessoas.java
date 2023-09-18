/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aexecicio01poo;

/**
 *
 * @author Pichau
 */
public class Pessoas{
    private String nome, sexo;
    private int idade;

    public Pessoas(String nome, int idade, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    
    
    //metodos publicos
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    
    //Metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
}
