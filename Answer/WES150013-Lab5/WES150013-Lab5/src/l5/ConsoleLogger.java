package l5;
public class ConsoleLogger implements Logger{

    public ConsoleLogger() {
    }

    
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
    
}
