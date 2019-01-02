package l4ap1;
public class ConsoleLogger implements Logger{

    public ConsoleLogger() {
    }

    
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
    
}
