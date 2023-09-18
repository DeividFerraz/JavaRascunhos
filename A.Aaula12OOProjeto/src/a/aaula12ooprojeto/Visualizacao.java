/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aaula12ooprojeto;

/**
 *
 * @author Pichau
 */
public class Visualizacao { //Classe de agregaçao
    private Gafanhotos expectatdor;
    private Video filme;

    public Visualizacao(Gafanhotos expectatdor, Video filme) {//colocar gafanhotos e video assistido nos parametros
        this.expectatdor = expectatdor;
        this.filme = filme;
        this.expectatdor.setTotalAssistido(this.expectatdor.getTotalAssistido() +1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    //Metodo de polimorfismo sobreCarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhotos getExpectatdor() {
        return expectatdor;
    }

    public void setExpectatdor(Gafanhotos expectatdor) {
        this.expectatdor = expectatdor;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "expectatdor=" + expectatdor + ", filme=" + filme + '}';
    }
    
    
}
