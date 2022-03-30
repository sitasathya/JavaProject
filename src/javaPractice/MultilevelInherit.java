package javaPractice;

public class MultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Z obj1 = new Z();
   obj1.display();
   obj1.show();
   obj1.print();
   		
 
	
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
  
}
  
