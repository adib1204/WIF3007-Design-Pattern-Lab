package observer;
public class Test {
    public static void main(String[] args) {
        Commentary comment = new Commentary();
        LiveUpdate adam = new LiveUpdate(comment, "Adam Warner", "New York");
        LiveUpdate tim = new LiveUpdate(comment, "Tim Rooney", "London");
        
        comment.setCommentary("Welcome to live Soccer match");
        comment.setCommentary("Current score 0-0");
        
        tim.removeSubscription();
        
        comment.setCommentary("It's a goal");
        comment.setCommentary("Current score 1-0");
        
        LiveUpdate marrie = new LiveUpdate(comment, "Marrie", "Paris");
        
        comment.setCommentary("It's another goal");
        comment.setCommentary("Half-time score 2-0");
        
    }   
}
