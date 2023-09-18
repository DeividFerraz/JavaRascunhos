package a.aaula07oolutador;

public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade;
    private float altura, peso;
    private int vitorias, derrotas, empates;
    
    
    //metodos publicos
    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("Chegou a hora apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos, e " + this.getAltura()+ " de altura!");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " - Vitorias");
        System.out.println(this.getDerrotas() + " - Derrotas");
        System.out.println(this.getEmpates() + " - Empates");
    }
    public void status(){
        System.out.println("---------------------------------------"
                + "                   "
                + "                   ");
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " Vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        //this.vitorias = this.vitorias + 1; o de cima é  mesma coisa do que esse de baixo, é apenas uma sintaxe diferente.
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "medio";
        } else if (this.peso <= 120.2){
            this.categoria = "invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
}
