package l11;

public class OverDrawnState implements State{

    private final BusinessAcccount bac;

    public OverDrawnState(BusinessAcccount bac) {
        this.bac = bac;
    }
    
    @Override
    public boolean deposit(double amount) {
        System.out.println("Transaction Fee ($5.0)was charged due to account "
                + "status(Overdrawn)");
        bac.setBalance(bac.getBalance()+amount- 
                BusinessAcccount.TRANS_FEE_OVERDRAW);
        bac.setState(transitionState());
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        double temp = bac.getBalance() - amount - 
                BusinessAcccount.TRANS_FEE_OVERDRAW;
        if(temp<BusinessAcccount.OVERDRAW_LIMIT){
            return false;
        }
        else{
            System.out.println("Transaction Fee ($5.0)was charged due to account "
                + "status(Overdrawn)");
            bac.setBalance(temp);
            bac.setState(transitionState());
            return true;
        }
    }

    @Override
    public State transitionState() {
        double bal = bac.getBalance();
        if(bal>=BusinessAcccount.MIN_BALANCE){
            return bac.getNoTransactionFeeState();
        }
        else if(bal>=0 && bal<BusinessAcccount.MIN_BALANCE){
            return bac.getTransactionFeeState();
        }
        else{
            return bac.getOverDrawnState();
        }
    }

}
