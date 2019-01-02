package lab6b;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class FileUtility {
    
    public FileUtility() {
    }
    
    public boolean writeToFile(String fileName, String msg){
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(fileName,true));
            out.println(msg);
            out.close();
        } catch (IOException e) {
        }
        return true;
    }
}
