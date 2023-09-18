package a.aaula12ooprojeto;

import java.util.Scanner;

public class AAaula12OOProjeto {

    public static void main(String[] args) {
        
       Scanner a = new Scanner(System.in);
       
       
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhotos g[] = new Gafanhotos[2];
        g[0] = new Gafanhotos("Julio", "M", 22, "juli");
        g[1] = new Gafanhotos("Deivid", "M", 23, "Deiv");
        
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
    
}
