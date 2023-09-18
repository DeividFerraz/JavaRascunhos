package a.aaula07oolutador;

public class AAaula07OOLutador {

    public static void main(String[] args) {
        
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("deivid", "brasil", 31, 1.75f, 
                68.9f, 11, 2, 1);
        
        l[1] = new Lutador("ana rubia", "Hungria", 16, 1.55f, 
                58.9f, 0, 23, 9);
        
        l[2] = new Lutador("Westerson", "Arrombaria", 98, 1.85f, 
                87.9f, 5, 8, 34);
        
        l[3] = new Lutador("Monica", "Veilouca", 40, 1.63f, 
                78.7f, 20, 0, 0);
        
        l[4] = new Lutador("Yzabella", "EUA", 9, 1.45f, 
                80.3f, 10, 0, 4);
        
        l[5] = new Lutador("goiabinha", "Penapoles", 41, 1.71f, 
                92.4f, 14, 07, 9);
       /* Lutador l = new Lutador("Deivid", "Hungria", 31, 1.75f, 68.9f, 11, 2, 4);
        l.apresentar();*/
       
       
       Luta UEC01 = new Luta();
       
       UEC01.marcarLuta(l[2], l[5]);
       UEC01.lutar();
       
       
       l[1].status();
       
       
        
    }
    
}
