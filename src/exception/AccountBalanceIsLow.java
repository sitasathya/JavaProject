package exception;

public class AccountBalanceIsLow extends RuntimeException{
	AccountBalanceIsLow(String msg){
		super(msg);
	}
	
}
