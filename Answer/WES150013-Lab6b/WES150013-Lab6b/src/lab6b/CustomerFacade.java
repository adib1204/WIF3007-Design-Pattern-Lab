package lab6b;

public class CustomerFacade {
    
    private Account acc;
    private Address add;
    private CreditCard cc;

    public CustomerFacade(Account acc, Address add, CreditCard cc) {
        this.acc = acc;
        this.add = add;
        this.cc = cc;
    }
    
    public void printOutput(){
        boolean nameValid = acc.isValid();
        boolean addressValid = add.isValid();
        boolean ccValid = cc.isValid();
        System.out.println("First name = "+acc.getFirstName()+", Last Name = "+acc.getLastName());
        System.out.println("Address = "+add.getAddress()+", City = "+add.getCity()+", State = "+add.getState());
        System.out.println("Card type = "+cc.getCardType()+", Card Number = "+cc.getCardNumber()+", Card expiry date = "+cc.getCardExpDate());
        
        if (nameValid) {
            System.out.println("Valid FirstName/LastName");
        } else {
            System.out.println("Invalid FirstName/LastName");
        }
        
        if (addressValid) {
            System.out.println("Valid Address/City/State");
        } else {
            System.out.println("Invalid Address/City/State");
        }
        
        if (ccValid) {
            System.out.println("Valid CreditCard");
        } else {
            System.out.println("Invalid CreditCard");
        }
        
        if (nameValid&&addressValid&&ccValid) {
            acc.save();
            add.save();
            cc.save();
            System.out.println("==>Valid Customer Data: Data Saved Successfully");
        } else {
            System.out.println("==>Invalid Customer Data: Data Could Not Be Saved");
        }
    }
}
