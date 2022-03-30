package exception;

// An error that occurs in a program during runtime
// try- block of code monitor for errors
//catch- Exception handlers
//checked exception- compiler will show u error- handle with try & catch method.
//unchecked- no error 
public class Exceptionhand {

	public static void main(String[] args) {
		
		int[] nums=new int[5];
		
		try {
			System.out.println(" In try 1");
			errorMethod(nums);
			System.out.println(" In try 2");
			
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(" Catch 1");
		}
		catch(Exception ex){
			System.out.println(" In catch2");
			
		}
		System.out.println(" Rest of program.");
		

	}


public static void errorMethod(int[] nums) {
	nums[10]=25;
	}
}