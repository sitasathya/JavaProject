package Polymorphism;

public class MethodOverlaod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverlaod a= new MethodOverlaod();

		System.out.println(a.add(7,8));
		System.out.println(a.add(7,8,9));
		System.out.println(a.add(7,8,9,10));
		
	}
		int add(int a, int b) {
			
			return a+b;
			
		}
		int add(int a, int b, int c) {
			
			return a+b+c;
			
			
		}
		int add(int a, int b, int c, int d) {
			
			return a+b+c+d;
		}
	}



// ability of  an object to take more than one form is Polymorphism
//with in same class -overloading
// same name, difft parameter
//return type

