package l7;

public class MoveCommand implements CommandInterface{

    private Item item;
    private Category category, newCategory;

    public MoveCommand(Item item, Category category, Category newCategory) {
        this.item = item;
        this.category = category;
        this.newCategory = newCategory;
    }
    
    
    @Override
    public void execute() {
        System.out.println("Move the '"+item.getItemname()+"' from the "
                +category.getCategoryName()+" to "+newCategory.getCategoryName());
        item.deleteCategory(category);
        
        item.addCategory(newCategory);
    }

}
