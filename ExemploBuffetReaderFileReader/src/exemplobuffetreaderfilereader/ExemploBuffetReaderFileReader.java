package exemplobuffetreaderfilereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBuffetReaderFileReader {

    public static void main(String[] args) {
        String path = "C:\\windows\\Temp\\in.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e){
            System.out.println("error: " + e.getMessage());
        }
    }
    
}
