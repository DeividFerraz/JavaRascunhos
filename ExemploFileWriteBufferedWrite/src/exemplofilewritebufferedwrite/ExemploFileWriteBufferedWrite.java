package exemplofilewritebufferedwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploFileWriteBufferedWrite {
    //esse serve para add um arquivo
    public static void main(String[] args) {
        String[] lines = new String[] {"bom dia", "boa tarde", "boa noite"};
    
        String path = "C:\\Windows\\Temp\\out.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){//esse true serve para não recriar o arquivo
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }    
}
