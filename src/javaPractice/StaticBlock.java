package javaPractice;

public class StaticBlock {
	{
	System.out.println(" This is a instance Block");
	}
	static {
		System.out.println(" This is a static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a main");
		StaticBlock b= new StaticBlock();
		StaticBlock b1= new StaticBlock();
		StaticBlock b2= new StaticBlock();
		
		

	}

}
//static block executed once main method start executing
// instance block need an object to get executed