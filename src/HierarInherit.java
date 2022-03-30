
public class HierarInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.display();
		b.sum();
		C c = new C();
		c.display();
		c.mult();
		D d = new D();
		d.display();
		d.mod();
		E e = new E();
		e.display();
		e.mod1();
	}

}
class A{
	
	int a= 40;
	void display() {
		System.out.println(" Class A  integer a = " +a);
		
	}
	
}
class B extends A{
	
	int b = 45;
	void sum() {
		
		int sum = a+b;
		System.out.println(" Sum of Class A  & Class B = "  +sum);
		
	}
	
}
class C extends A{
	
	int c =90;
	void mult() {
	int prod= c*a;
	System.out.println(" Product of Class A & Class C = " +prod);
	
	}
	
}
class D extends A{
	
	int d=5;
	
	void mod() {
		
		int rem= a % d;
		
		System.out.println(" Reminder of of Class A % Class B " +rem);
		
	}
	
}
class E extends A{
	
	int e=9;
	
	void mod1() {
		int rem1=a %e;
		
		System.out.println(" Reminder of of Class A % Class E " +rem1);
		
	}
}