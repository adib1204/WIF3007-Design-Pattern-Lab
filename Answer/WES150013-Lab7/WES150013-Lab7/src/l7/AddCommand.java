package l7;
//Concrete command to add an item to a category
public class AddCommand implements CommandInterface{

    private Item item;
    private Category category;

    public AddCommand(Item item, Category category) {
        this.item = item;
        this.category = category;
    }
        
    @Override
    public void execute() {
        item.addCategory(category);
    }

}
