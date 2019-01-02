package l4ap1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {

    public FileLogger() {
    }

    
    @Override
    public void log(String msg) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("log.txt",true));
            out.println(msg);
            out.close();
        } catch (IOException e) {}        
    }
    
}
