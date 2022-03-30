package javaPractice;

public class StaticMethod {
	int num=5;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		MethodDemo.m1();
		MethodDemo d= new MethodDemo();
		d.m2();
		System.out.println(MethodDemo.b);
		StaticMethod num1= new StaticMethod();
		System.out.println(" instance variable= " + num1.num);
		
	}

}
//static method no need to create an object while execution
//static can access static variable only.to access instance need an object
//instance method need an object
class MethodDemo{
	int a=20;
	static int b= 40;
	
	static void m1() {
		++b;
		MethodDemo v= new MethodDemo();
		++ v.a;
		
		System.out.println(" This is a static method");
		System.out.println(" b= " +b);
		System.out.println(" a= " +v.a);
		}
	//static method can access static variable only
	void m2() {
		int c=a+b;
		System.out.println(" c= " +c);
		System.out.println(" This is a instance method");
		
	}
}