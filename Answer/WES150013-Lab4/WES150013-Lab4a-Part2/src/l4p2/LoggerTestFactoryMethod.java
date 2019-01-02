package l4p2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerTestFactoryMethod {
    public static void main(String[] args) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
        String message = timestamp + "Hello. Nice to Meet You";
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log(message);
    }
    
}
