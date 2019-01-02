package l11;

public class TransactionFeeState implements State{

    private final BusinessAcccount bac;

    public TransactionFeeState(BusinessAcccount bac) {
        this.bac = bac;
    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Transaction Fee ($2.0)was charged due to account "
                + "status (less than minimum balance)");
        bac.setBalance(bac.getBalance()+amount-BusinessAcccount.TRANS_FEE_NORMAL);
        bac.setState(transitionState());
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        double temp = bac.getBalance() - amount - 
                BusinessAcccount.TRANS_FEE_NORMAL;
        if(temp<BusinessAcccount.OVERDRAW_LIMIT){
            return false;
        }
        else{
            System.out.println("Transaction Fee ($2.0)was charged due to account "
                + "status (less than minimum balance)");
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
