package l4b;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

    public LoggerFactory() {
    }
    
    public Logger getLogger(){
        if(isFileLoggingEnabled()){
            return FileLogger.getInstance();
        }
        else{
            return new ConsoleLogger();
        }
    }
    
    private  static boolean isFileLoggingEnabled(){
        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            String fileValue = p.getProperty("FileLogging");
            return fileValue.equalsIgnoreCase("on") == true;
            
        } catch (IOException e) {
            return false;
        }
    }
}
