package nelioalvesstringbuilder;

import entitites.Comment;
import entitites.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class NelioAlvesStringBuilder {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Uau que legal!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                "Viajando EUROPA", "Vou visitar esse lindo pais", 12);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);
    }
    
}
