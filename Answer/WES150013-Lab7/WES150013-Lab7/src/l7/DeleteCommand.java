package l7;

public class DeleteCommand implements CommandInterface{

    private Item item;
    private Category category;

    public DeleteCommand(Item item, Category category) {
        this.item = item;
        this.category = category;
    }
    
    
    @Override
    public void execute() {
        item.deleteCategory(category);
    }

}
