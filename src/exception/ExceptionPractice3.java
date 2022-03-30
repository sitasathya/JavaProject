package exception;

public class ExceptionPractice3 {
	
	
public static void main(String[] args) {
	

	try{
		System.out.println("Before throw");
		throw new ArithmeticException();
		
	}
	catch(ArithmeticException ex) {
		System.out.println(ex);
	}

}
}
// ArithmeticException throw