package l11;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String acc = "1111 2222 3333 4444";
        BusinessAcccount ba = new BusinessAcccount(acc);
        Scanner kb = new Scanner(System.in);
        int choice;
        double money;
        boolean success;
        do {
            System.out.print("Enter 1 to display account, 2 to deposit, 3 to "
                    + "withdraw, 0 to exit: ");
            choice=kb.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("This program will exit");
                    break;
                case 1:
                    ba.displayAcc();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    money = kb.nextDouble();
                    success = ba.deposit(money);
                    if(success) {
                        System.out.println("An amount  " +money+ " is deposited");
                        ba.displayAcc();
                    }
                    break;
                    case 3:
                    System.out.print("Enter amount to withdraw: ");
                    money = kb.nextDouble();
                    success = ba.withdraw(money);
                    if(success){
                        System.out.println("An amount "+money+" is withdrawn");
                    }
                    else{
                        System.out.println(BusinessAcccount.ERR_OVERDRAW_LIMIT_EXCEED);
                    }
                    ba.displayAcc();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
                    break;
            }
            
        } while (choice!=0);
    }
    
}
