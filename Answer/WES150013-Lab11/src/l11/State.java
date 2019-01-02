package l11;

public interface State {

    public boolean deposit(double amount);
    public boolean withdraw(double amount);
    public State transitionState();
}
