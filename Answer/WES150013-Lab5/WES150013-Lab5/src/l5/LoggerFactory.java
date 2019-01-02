package l5;

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
            if (fileValue.equalsIgnoreCase("on") == true) {
                return true;
            } else {
                return false;
            }
            
        } catch (IOException e) {
            return false;
        }
    }
}
