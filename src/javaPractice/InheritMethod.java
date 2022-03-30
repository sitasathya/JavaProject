package javaPractice;

public class InheritMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new B();
		obj.sum();
		obj.display();
	}

}
//single inheritance child class B inherits the property of parent class A

class A{
	int b=30;
	int c=40;
	void display() {
		
			System.out.println(" b= " +b + " c= " +c);
	}

	}
class B extends A{ // B is the child class of A
	int a; // gets the properties from the parent class A
	void sum() {
		
			a= b+c;
			
			System.out.println(" sum =" +a);
	}

	}

