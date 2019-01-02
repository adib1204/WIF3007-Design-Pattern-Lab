package l4b;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {

    private static FileLogger uniqueFileLogger;

    private FileLogger(){};
    public static FileLogger getInstance() {
        if(uniqueFileLogger==null){
            System.out.println("Creating new instance of file logger");
            uniqueFileLogger = new FileLogger();
        }
        else{
            System.out.println("Instance of file logger already exist");
        }
        return uniqueFileLogger;
    }
    
    @Override
    public void log(String msg) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("log.txt",true));
            out.println(msg);
            out.close();
            System.out.println("Message successfully saved in the file");
        } catch (IOException e) {}        
    }
    
}
