package l5;
public class EncFileLogger extends LoggerDecorator{

    public EncFileLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        String encMsg = "!@#$% "+msg+" ^&*()";
        logger.log(encMsg);
    }
    
}
