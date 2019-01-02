package l4b;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerTestFactoryMethod {
    public static void main(String[] args) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
        String message = timestamp + "Hello. Nice to Meet You";
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log(message);
        if(logger instanceof FileLogger){
            System.out.println("Trying to create new instance FileLogger");
            Logger logger2 = factory.getLogger();
            timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
            message= timestamp + "This is second message";
            logger2.log(message);
        }
    }
    
}
