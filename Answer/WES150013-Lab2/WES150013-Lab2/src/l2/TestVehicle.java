package l2;

public class TestVehicle {
    
    public static void main(String[] args){
        VehicleSystem sr = new StreetRacer();
        sr.display();
        sr.performMove();
        
        VehicleSystem fo = new FormulaOne();
        fo.display();
        fo.performMove();
        
        VehicleSystem ac = new Aircraft();
        ac.display();
        ac.performMove();
        
        Aircraft ac1 = new Aircraft();
        ac1.display();
        ac1.performMove();
        System.out.print("I'm arriving at the pathway. ");
        ac1.setMoveBehaviour(new Drive());
        ac1.performMove();
        ac1.setMoveBehaviour(new Halt());
        ac1.performMove();
        
    }
}
