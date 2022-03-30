package superConstructor;

public class SuperCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C c =new C();
	}

}


// internally writing super keyword . so whenver object is created for c ..it calls immediate parent b and then A
class A{
	A(){
		System.out.println("A Class 0 arg constructor");
	}
}
class B extends A{
	B(){
		System.out.println("B Class 0 arg constructor");
	}
}
class C extends B{
	C(){
		System.out.println("C Class 0 arg constructor");
	}
}