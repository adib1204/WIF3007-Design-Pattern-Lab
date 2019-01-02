package l4ap1;

import java.io.IOException;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerTest {
    public static void main(String[] args) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
        String message = timestamp + "Hello. Nice to Meet You";
        if(isFileLoggingEnabled()){
            FileLogger log = new FileLogger();
            log.log(message);
        }
        else{
            ConsoleLogger log = new ConsoleLogger();
            log.log(message);
        }
    }
    
    public static boolean isFileLoggingEnabled(){
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
