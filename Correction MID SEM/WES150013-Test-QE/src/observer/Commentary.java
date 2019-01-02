package observer;

import java.util.ArrayList;

public class Commentary implements Subject {
    private ArrayList<Observer> observers;
    private String msg;

    public Commentary() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {       
        boolean success = observers.add(o);
        if(success) System.out.println("Subscribed successfully\n");
        else System.out.println("Fail to subscribe\n");
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
            System.out.println("Unsubscribed successfully\n");
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(msg);
        }
        System.out.println("");
    }
    
    public void commentaryChanged(){
        notifyObserver();
    }
    
    public void setCommentary(String msg){
        this.msg = msg;
        commentaryChanged();
    }
    
    
}
