package l7;


import l7.CommandInterface;

public class NoCommand implements CommandInterface{

    public NoCommand() {
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

}
