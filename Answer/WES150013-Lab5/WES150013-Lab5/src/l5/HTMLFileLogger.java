package l5;


public class HTMLFileLogger extends LoggerDecorator{

    public HTMLFileLogger(Logger logger) {
        this.logger=logger;
    }

    
    @Override
    public void log(String msg) {
        String htmlMsg = "<HTML><BODY><b>" + msg + "</b></BODY></HTML>";
        logger.log(htmlMsg);
    }
    
}
