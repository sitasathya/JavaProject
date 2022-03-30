package javaPractice;

public class ThisKeywordMethod {

public static void main(String[] args) {
	ThisKeywordMethod m= new ThisKeywordMethod();
	m.m1();
	demo d =new demo();
	d.m3();
	
}



void m1() {
	System.out.println(" This is a m1 method");
	m2(); //default current class object this.m2()
}
void m2() {
	System.out.println(" This is a m2 method");
}
}

class demo{
	void m3() {
		ThisKeywordMethod method= new ThisKeywordMethod();
		method.m2();
		
			System.out.println(" This is a m3 method");
		}
	}

