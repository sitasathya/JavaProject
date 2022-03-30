package javaPractice;

public class MultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Z1 objz =new Z1();
 objz.display();
 objz.show();
 objz.print();
 objz.print1();		
 
	
	}

}
class X{
	int a=20;
	void display(){
		System.out.println("  Integer in Class X is a= " +a);
	}
			
}
class Y extends X{
	int b= 40;
	void show() {
		int prod = a*b;
		
		System.out.println("product of class X & Y =" +prod);
	}
}

class Z extends Y{
	
	int c = 78;
	
	void print() {
	
		int sum = a+b+c;
		
		System.out.println("Sum of class X ,Y & Z = " +sum);
		
	}
  class Z1 extends Z{
	  int d=71;
	  void print1(){
		  int sum1 = a+b+c+d;
		  System.out.println("Sum of class X ,Y ,Z & Z1 = " +sum1);
		  

}
