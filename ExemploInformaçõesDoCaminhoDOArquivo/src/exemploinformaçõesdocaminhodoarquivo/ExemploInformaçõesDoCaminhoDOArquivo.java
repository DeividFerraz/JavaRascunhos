package exemploinformaçõesdocaminhodoarquivo;

import java.io.File;
import java.util.Scanner;

public class ExemploInformaçõesDoCaminhoDOArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        System.out.println("getName: " + path.getName());//Pega só o ultimo nome digitado
        System.out.println("getParente: " + path.getParent());//Pega os nomes antes do ultimo nome digitado
        System.out.println("getPath: " + path.getPath());//Pega a estenção toda do arquivo
    }
    
}
