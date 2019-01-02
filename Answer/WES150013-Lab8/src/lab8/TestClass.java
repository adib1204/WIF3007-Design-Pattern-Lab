package lab8;
public class TestClass {

    public static void main(String[] args) {
        Visa visa1 = new Visa("Visa","1234123412341234", 11, 2004);
        Visa visa2 = new Visa("Visa", "1234567890123456", 11, 2020);
        Visa visa3 = new Visa("Visa", "4234567890123456", 11, 2020);
        MasterCard ms1 = new MasterCard("MasterCard", "5448755330349315", 4, 2021);
        DinersClub dc1 = new DinersClub("Diners Club", "30263720264678", 5, 2025);
        
        System.out.println("Check each card validity");
        visa1.checkCardValidity();
        System.out.println("");
        visa2.checkCardValidity();
        System.out.println("");
        visa3.checkCardValidity();
        System.out.println("");
        ms1.checkCardValidity();
        System.out.println("");
        dc1.checkCardValidity();
    }
    
}
