package javaPractice;

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer.inner.printmsg();
		
	}

}
class outer{ // can't create outer class as static
	static class inner{ //only inner class can have static
		static void printmsg() {
			System.out.println("This is staic inner class");
			
		}
		
	}
	
}