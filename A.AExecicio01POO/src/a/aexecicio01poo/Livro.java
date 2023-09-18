/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.aexecicio01poo;

/**
 *
 * @author Pichau
 */
public class Livro  implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual = 0; 
    private boolean aberto;
    private Pessoas leitor;

   
    public String detalhes() {
        return "Livro: " + "titulo = "  + titulo + "\nautor  = " + autor + "\n"
                + "totalPaginas = " + totalPaginas + "\npagAtual = " + pagAtual + "\n"
                + "aberto = " + aberto + "\nleitor = " + leitor.getNome() + "\nidade = " + leitor.getIdade() + "\nSexo = " + leitor.getSexo();
    }

    
    
    
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoas leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.pagAtual = 0;
        } else{
            this.pagAtual = p;
        }
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
       
    
}
