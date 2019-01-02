package l7;

public class ItemManager {
    
    private CommandInterface[] addCommands;
    private CommandInterface[] deleteCommands;

    public ItemManager() {
        addCommands = new CommandInterface[7];
        deleteCommands = new CommandInterface[7];
        
        CommandInterface noCommand = new NoCommand();
        for(int i=0; i<addCommands.length; i++) {
            addCommands[i] = noCommand;
            deleteCommands[i] = noCommand;
        }
    }
    
    public void executeAddCommand(int slot) {
        addCommands[slot].execute();
    }
    
    public void executeDeleteCommand(int slot) {
        deleteCommands[slot].execute();
    }
    
    public void setCommand(int index, CommandInterface addCommand, CommandInterface deleteCommand){
        addCommands[index] = addCommand;
        deleteCommands[index] = deleteCommand;
    }
}
