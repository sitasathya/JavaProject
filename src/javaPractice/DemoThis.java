package javaPractice;
// invoke current class constructor

public class DemoThis {

	DemoThis(){
		this(10);// go to one arg
		System.out.println(" 0 args Constructor"); // invoke thi lat
}
	DemoThis(int a ){
		this(7,8); // goto 2 arg
		System.out.println(" 1 args Constructor");
	}
	DemoThis(int b ,int c){
		System.out.println(" 2 args Constructor");
}
	DemoThis(int x, int y , int z){
		System.out.println(" 3 args Constructor");
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DemoThis d= new DemoThis();
    
 
	}

}
