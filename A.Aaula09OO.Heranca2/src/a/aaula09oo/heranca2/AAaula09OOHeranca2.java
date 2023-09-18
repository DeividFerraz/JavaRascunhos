/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.aaula09oo.heranca2;

/**
 *
 * @author Pichau
 */
public class AAaula09OOHeranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa(); Nao funciona por pessoa ser a classe abstrata
        
        /*
        Visitante v1 = new Visitante();//Mesmo que essa classe nao tenha nada ela funciona pois recebe a classe pessoa
        v1.setNome("Juvena");
        v1.setIdade(19);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());*/
        
        
        Aluno a1 =  new Aluno();
        a1.setNome("Claudio");
        a1.setMatriculo(1111);
        a1.setCurso("info");
        a1.setIdade(23);
        a1.setSexo("Elo");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatriculo(22203);
        b1.setNome("Juila");
        b1.setBolsa(12.6f);
        b1.setSexo("Feminine");
        b1.pagarMensalidade();
        
    }
    
}
