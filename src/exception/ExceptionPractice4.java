package exception;

public class ExceptionPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[5];
		
		

		try {
			System.out.println("In try");
			nums[10]=25;
			
		}
		catch(Exception ex) {
			
			System.out.println("In Exception");
			return;
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
//clean up related code
