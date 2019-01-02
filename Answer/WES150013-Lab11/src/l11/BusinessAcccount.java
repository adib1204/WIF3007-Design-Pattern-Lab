package l11;

public class BusinessAcccount {
    public static final double MIN_BALANCE = 2000.0;
    public static final double OVERDRAW_LIMIT = -1000.00;
    public static final double TRANS_FEE_NORMAL = 2.00;
    public static final double TRANS_FEE_OVERDRAW = 5.00;
    public static final String ERR_OVERDRAW_LIMIT_EXCEED = 
            "Error: Transaction cannot be processed. " + 
            "Overdraw limit exceeded.";
    
    private State noTransactionFeeState;
    private State overDrawnState;
    private State transactionFeeState;
    private State state;
    private String accountNumber;
    private double balance;

    public BusinessAcccount(String accountNumber) {
        this.accountNumber = accountNumber;
        
        noTransactionFeeState = new NoTransactionFeeState(this);
        overDrawnState = new OverDrawnState(this);
        transactionFeeState = new TransactionFeeState(this);
        
        state = noTransactionFeeState;
        balance = 0.0;
    }
    
    public State getState() {
        return state;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public State getNoTransactionFeeState() {
        return noTransactionFeeState;
    }

    public State getOverDrawnState() {
        return overDrawnState;
    }

    public State getTransactionFeeState() {
        return transactionFeeState;
    }
    
    public void setState(State newState) {
        state = newState;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean deposit(double amount){
        return state.deposit(amount);
    }
    
    public boolean withdraw(double amount) {
        return state.withdraw(amount);
    }
    
    public void displayAcc(){
        System.out.println("Account Number = "+accountNumber +
                ", Balance = "+balance);
    }
    
    
}
