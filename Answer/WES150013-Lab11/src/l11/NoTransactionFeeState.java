package l11;

public class NoTransactionFeeState implements State{
    
    private final BusinessAcccount bac;

    public NoTransactionFeeState(BusinessAcccount bac) {
        this.bac = bac;
    }   
    
    @Override
    public boolean deposit(double amount) {
        bac.setBalance(bac.getBalance()+amount);
        bac.setState(transitionState());
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        double temp = bac.getBalance() - amount;
        if(temp<BusinessAcccount.OVERDRAW_LIMIT){
            return false;
        }
        else{
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
            System.out.println("Attention: Your Account is Overdrawn");
            return bac.getOverDrawnState();
        }
    }

}
