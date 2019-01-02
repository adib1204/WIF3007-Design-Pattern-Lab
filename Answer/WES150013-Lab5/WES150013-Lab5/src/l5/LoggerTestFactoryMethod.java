package l5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerTestFactoryMethod {
    public static void main(String[] args) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
        String message = timestamp + "Hello. Nice to Meet You";
        
        LoggerFactory factory = new LoggerFactory();
        
        Logger logger = factory.getLogger();
        logger = new HTMLFileLogger(logger);
        logger.log(message);
        
        timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
        message = timestamp + "Hello. Nice to Meet You";
        
        Logger logger2 = factory.getLogger();
        logger2 = new EncFileLogger(logger2);
        logger2.log(message);
        
    }
    
}
