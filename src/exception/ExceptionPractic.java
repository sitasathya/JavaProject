package exception;

public class ExceptionPractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numer= {4,8,16,32};
		int[] denom= {2,0,4,4};
		for(int i =0;i<numer.length;i++) {
			
			try {
				
				System.out.println(numer[i]/denom[i]);
			}
			catch(ArithmeticException ex) {
				
				System.out.println("You cant divide by zero");
			}
		}
			
		
		}
         // to check git hub pull comment
}
