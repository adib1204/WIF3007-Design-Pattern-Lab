package lab8;

public class DinersClub extends Card{

    public DinersClub(String cardType, String cardNumber, int expMonth, int expYear) {
        super(cardType, cardNumber, expMonth, expYear);
    }

    @Override
    protected boolean isLengthValid() {
        String msg = "Card Length";
        boolean valid;
        int length = cardNumber.length();
        
        valid = length==14;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isPrefixValid() {
        String msg = "Prefix";
        boolean valid;
        int num = Integer.parseInt(cardNumber.substring(0, 2));
        
        valid=num==30||num==36||num==38;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isGoodStanding() {
        return true;
    }

}
