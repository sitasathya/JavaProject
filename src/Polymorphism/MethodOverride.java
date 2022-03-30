package Polymorphism;

public class MethodOverride {

	// within parent child class
	//same name same signature or parameter
	//different type of return type or parameter not allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b =new Bank();
		b.loginApp();
		HDFC h =new HDFC();
		h.loginApp();
		
		System.out.println("===================");
		b.loginApp();
		CitiBank c =new CitiBank();
		c.loginApp();

	}

}
class Bank{
	
	void loginApp() {
		
		System.out.println(" Enter UserName :");
		System.out.println(" Enter Password :");
		System.out.println(" Click Submit Button");
	}
	
}
class HDFC extends Bank{
	
	  void loginApp() {
		  
		  System.out.println(" Enter Mobile Number :");
	  }
	
}
class CitiBank extends Bank{
	
	void loginApp() {
		
		System.out.println(" Forgot Password");
	}
	
}