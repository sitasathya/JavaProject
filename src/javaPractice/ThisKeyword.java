package javaPractice;

public class ThisKeyword {
// refer current class variable
// current class method
// current class constructor
	String name;
	int id;
	String address;
	ThisKeyword( String name,int id,String address){
		
		this.name=name; // object for current class variable
		this.id=id;
		this.address= address;
		
	}
	void display(){
	
		System.out.print( name + id + address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword c= new ThisKeyword("Tom ", 22616 ," Saticoy Street");
		
		c.display();

	}

}
