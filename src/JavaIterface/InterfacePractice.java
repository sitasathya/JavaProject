package JavaIterface;

public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		B b;
		b= new C();
		a= new C();
		a.show();
		a.display();
		b.display2();
		b.print();
 
	}

}


interface A{
int a=20;   // all method by default public abstract

void display();// final variable
void show();

}
interface B{
	
	void print();
	void display2();
}
class C implements A,B{
	public void display() {
		System.out.println(" This is a Class C display method  declared in interface A \n");
		}
	public void show() {
		System.out.println(" This is a Class C show method declared in interface A \n");
		}
	
	public void display2() {
		System.out.println(" This is a class C display2 method declared in interface B \n ");
		}
	public void print() { 
		System.out.println(" This is a class C show method declared in interface B \n ");
}

}