/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula09oo.heranca2;

/**
 *
 * @author Pichau
 */
public class final Aluno extends Pessoa{
    private String curso;
    private int matriculo;

    public final void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatriculo() {
        return matriculo;
    }

    public void setMatriculo(int matriculo) {
        this.matriculo = matriculo;
    }
    
    
}
