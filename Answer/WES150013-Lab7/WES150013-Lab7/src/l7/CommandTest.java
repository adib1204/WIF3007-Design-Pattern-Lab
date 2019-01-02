package l7;
/**
 * Refer UML to understand further
 * Although in the lab question we need to have two HashMap(1 in Item, 1 in Category),
 * I found that we don't use the HashMap in Category class. So I discarded the suggestion.
 */
public class CommandTest {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();
        
        Item duet = new Item("Duet");
        Category cd = new Category("CD");
        Category newReleases = new Category("New Releases");
        
        AddCommand duetToCd = new AddCommand(duet, cd);
        AddCommand duetToNew = new AddCommand(duet, newReleases);
        DeleteCommand deleteCd = new DeleteCommand(duet, cd);
        DeleteCommand deleteNew = new DeleteCommand(duet, newReleases);
        
        manager.setCommand(0, duetToCd, deleteCd);
        manager.setCommand(1, duetToNew, deleteNew);
        
        manager.executeAddCommand(0);
        manager.executeAddCommand(1);
        System.out.println(duet.toString());
        manager.executeDeleteCommand(1);
        System.out.println(duet.toString());
        
        Item single = new Item("A Beautiful Mind");
        Category book = new Category("Book");
        
        AddCommand singleToCd = new AddCommand(single, cd);
        MoveCommand cdToBook = new MoveCommand(single, cd, book);
        
        manager.setCommand(2, singleToCd, cdToBook);
        
        System.out.println("");
        manager.executeAddCommand(2);
        manager.executeDeleteCommand(2);
        System.out.println(single.toString());
    }
    
}
