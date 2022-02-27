import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args){

    }
}

class BankAccount{

    // Lets write our 4 variables for balance of the customer, their previous transactions, name and ID.
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    // constructor with parameters customerName and customerId

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }


    // deposit will take a parameter which is amount to know the amount that is to be deposited.
    void deposit(int amount){
        // We do not want the amount to be 0, so we are making an exception here that amount is not 0.
        if (amount ! = 0){
            // Increment balance with the amount.
            balance = balance + amount;
            // Know the total amount after deposit.
            previousTransaction = amount;
        }
    }

    // Withdraw will take a parameter which is amount to know the amount that is to be withdrawn.
    void withdraw(int amount) {
        if(amount ! = 0){
            // this will now take out the amount from the balance
            balance = balance - amount;
            // this will tell the new total amount.
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        // greater than 0 means amount is deposited.
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        // less than 0 means amount is withdrawn.
        else if(previousTransaction < 0){
            // in order to not show a negative value as we have -amount on top  we use absolute method.
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else{
            // if both didnt happen then this.
            System.out.println("No transaction occured");
        }
    }
    // lets show the menu to the user.
    void showMenu()
}