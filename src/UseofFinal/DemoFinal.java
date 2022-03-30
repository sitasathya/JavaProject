package UseofFinal;


public class DemoFinal {
	
	static int a;
	{
		a=20;
	}	
	
	final int b=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		a= new A();
		a.display();
		
		a= new B();
		a.display();
		

	}

}
class A{
	void display() {
		System.out.println("Class A display method");
	}
}
final class B extends A{

	void display() {
		System.out.println("Class B display method");
	}
	
}

	