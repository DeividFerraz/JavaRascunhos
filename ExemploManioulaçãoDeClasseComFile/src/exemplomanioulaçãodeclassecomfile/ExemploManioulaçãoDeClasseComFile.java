package exemplomanioulaçãodeclassecomfile;

import java.io.File;
import java.util.Scanner;

public class ExemploManioulaçãoDeClasseComFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);//puxar as pastas
        System.out.println("Pastas: ");
        for(File folder : folders){
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);//puxar arquivos
        System.out.println("Arquivos: ");
        for(File file : files){
            System.out.println(files);
        }
        
        boolean sucess = new File(strPath + "\\subdir").mkdir();//criar pasta
        System.out.println("Arquivo criado com sucesso: " + sucess);
    }
    
}
