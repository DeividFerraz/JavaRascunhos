/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.aaula08oo.heranca;

/**
 *
 * @author Pichau
 */
public class AAaula08OOHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa h = new Pessoa();
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("pedro");
        p2.setNome("Maria");
        p3.setNome("Claudia");
        p4.setNome("Fabiana");
        
               
        p1.setIdade(22);
        p2.setIdade(34);
        p3.setIdade(45);
        p4.setIdade(17);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
 
    }
   
    
}
