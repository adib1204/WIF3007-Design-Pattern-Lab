package observer;

public class LiveUpdate implements Observer,SMS{

    private Subject commentary;
    private String msg;
    private final String name, city; 

    public LiveUpdate(Subject commentary, String name, String city) {
        this.commentary = commentary;
        this.name = name;
        this.city = city;
        
        System.out.println("Subscribing "+name+" ["+city+"] to Soccer Match (30th Oct 2018)...");
        this.commentary.registerObserver(this);
    }
    
    @Override
    public void update(String msg) {
        this.msg = msg;
        sendSMS();
    }

    @Override
    public void sendSMS() {
        System.out.println("("+name+" ["+city+"]): "+msg);
    }
    
    public void removeSubscription(){
        System.out.println("Unsubscribing"+name+" ["+city+"] to Soccer Match (30th Oct 2018)...");
        commentary.removeObserver(this);
    }

}
