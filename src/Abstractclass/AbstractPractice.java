package Abstractclass;

public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj =new B();
		obj.show();
		obj.print();
		obj.display();
		
	}

}
abstract class A{
	A(){
		System.out.println(" class A Constructor method");
	}
	void display() {
		System.out.println(" class A display method");
	}
		abstract void show();
		abstract void print();
	}

class B extends A{
	
	
	void show(){
		System.out.println(" This is a show method");
	}
	
	void print() {
		System.out.println(" This is a print method");
	}
	
}