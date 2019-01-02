package l7;

import java.util.ArrayList;
import java.util.HashMap;

public class Item {
    private final String itemname;
    private HashMap<String, Category> categories;
    

    public Item(String itemname) {
        this.itemname = itemname;
        categories = new HashMap<>();
    }

    public String getItemname() {
        return itemname;
    }    
    
    public void addCategory(Category category){
        categories.put(category.getCategoryName(), category);
        
        System.out.println("Item '"+itemname+"' has been added to the '"
                +category.getCategoryName()+"' category");
    }
    
    public void deleteCategory(Category category) {
        categories.remove(category.getCategoryName());
        
        System.out.println("Item '"+itemname+"' has been deleted from the '"
                +category.getCategoryName()+"' category");
    }
    
    @Override
    public String toString(){
        ArrayList<String> categoryList = new ArrayList<>();
        
        for(String key : categories.keySet()){
            categoryList.add(key);
        }
        
        String temp = "Item '"+itemname+"' belongs to these categories: "+categoryList.toString();
        return temp;
    }
}
