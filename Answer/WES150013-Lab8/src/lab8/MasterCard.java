package lab8;

public class MasterCard extends Card{

    public MasterCard(String cardType, String cardNumber, int expMonth, int expYear) {
        super(cardType, cardNumber, expMonth, expYear);
    }

    @Override
    protected boolean isLengthValid() {
        String msg = "Card Length";
        boolean valid;
        int length = cardNumber.length();
        
        valid = length==16;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isPrefixValid() {
        String msg = "Prefix";
        boolean valid;
        int num = Integer.parseInt(cardNumber.substring(0, 2));
        
        valid=num>=51&&num<=55;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isGoodStanding() {
        return true;
    }

}
