package exception;

import java.io.File;
public class Account {
	int balance=30000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Account a =new Account();
     a.withdraw(40000);
    
     }

	
	void withdraw(int amount) {
		if (balance>amount) {
			balance=balance-amount;
			System.out.println("Transaction is Done");
		}
		else	
		{
			throw new AccountBalanceIsLow("Your Account Balance is Low");
			
		}
	}
}



