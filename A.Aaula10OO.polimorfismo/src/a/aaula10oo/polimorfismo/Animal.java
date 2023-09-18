/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula10oo.polimorfismo;

/**
 *
 * @author Pichau
 */
public abstract class Animal {//metodo abstrato n pode virar objeto no programa principal
    //atributo de animal
    protected float peso;
    protected int idade, mebro;
    //metodo de animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void amitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMebro() {
        return mebro;
    }

    public void setMebro(int mebro) {
        this.mebro = mebro;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", mebro=" + mebro + '}';
    }
    
    
}
