package a.aexecicio01poo;
public class AAExecicio01POO {
    public static void main(String[] args) {
        Pessoas[] p = new Pessoas[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoas("Pedro", 22, "M");
        p[1] = new Pessoas("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo java", "jose silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro paulo", 500, p[1]);
        l[2] = new Livro("Java anaçado", "Maria candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(130);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
