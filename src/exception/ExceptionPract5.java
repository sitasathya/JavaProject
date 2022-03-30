package exception;

public class ExceptionPract5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	try {
		String s=null;
	
		int[] a= {10,20,50,60};
		int b= a[5]/0;
		System.out.println( + b);
		s.length();
		
		
	}
		
	
	catch(ArithmeticException e) {
	 
	 
	 System.out.println( "ArithmeticException");
	 System.out.println( e.getMessage());
	}
	 
 
	catch (NullPointerException e ) {
		
		System.out.println( "NullPointerException");
		System.out.println( e.getMessage());
	}

	catch(ArrayIndexOutOfBoundsException e) {
		
		 System.out.println( "ArrayIndexOutOfBoundsException");
		 System.out.println( e.getMessage());
		
	}
	catch(StringIndexOutOfBoundsException e) {
		
		System.out.println( "StringIndexOutOfBoundsException");
		System.out.println( e.getMessage());
	}
	
	
}
}



