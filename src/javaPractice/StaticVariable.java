package javaPractice;

public class StaticVariable {// public means its has its own file
	
	public static void main(String[] args) {
		
		VariableDemo v = new VariableDemo();
		v.IncrementbyOne();
		v.printData();
		
		VariableDemo v1 = new VariableDemo();
		v1.IncrementbyOne();
		v1.printData();
		
		VariableDemo v3 = new VariableDemo();
		v3.IncrementbyOne();
		v3.printData();
		
	}

}
// static Keyword belongs to the Class than an instance of the class
class VariableDemo{
	
	int a=30;  //instance Variable
	static int b = 30; //static variable

	void IncrementbyOne() {
		++a;
		++b;
	}
	void printData() {
		
		System.out.println("a= "+ a + " b= " +b);
	}
}