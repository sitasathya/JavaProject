package exception;
import java.util.Scanner;

public class ArrayLengthThrows {

	public static void main(String[] args) throws  ArrayIndexOutOfBoundsException {
		
		ArrayLengthThrows a= new ArrayLengthThrows();
		a.m1();
	}
		
		// TOD Auto-generated method stub}
	void m1() throws ArrayIndexOutOfBoundsException {
		
		try {
			m2();
		}
	
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
     void m2() {
    	 Scanner s = new Scanner(System.in);
    	 
    	 System.out.println(" Enter the numbers");
    	 int arr[]=new int[5];
    	 
    	 for (int i=0;i<5 ; i++) {
    		 arr[i]=s.nextInt();
    	 }
     }
		
	
}
