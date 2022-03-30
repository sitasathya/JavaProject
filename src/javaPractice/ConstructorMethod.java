package javaPractice;

public class ConstructorMethod {
	
	String Name;
	int id;
	String subject;
    int marks;

	ConstructorMethod(){
	
			System.out.println("This is a constructor method ");
	}
	ConstructorMethod(String name, int rollno, String sub, int grade){
		Name= name;
		id= rollno;
		subject = sub;
	    marks= grade;
	
	    }
	void display() {
		System.out.println(Name + id + subject + marks);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ConstructorMethod s = new ConstructorMethod();
		System.out.print("Name   " +"  id  " + " subject  "+ "marks");
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		//System.out.println();
		
		
		
		ConstructorMethod s1= new ConstructorMethod("Lian     ",1001, "  Math    ", 78);
		s1.display();
		
		ConstructorMethod s2= new ConstructorMethod("Henry    " ,1002,"  Math    ", 91);
		
		s2.display();
		ConstructorMethod s3= new ConstructorMethod("Oliver   " ,1003,"  Math    ", 99);
		s3.display();
		ConstructorMethod s4= new ConstructorMethod("Jack     " ,1004,"  Math    ", 68);
		s4.display();
		ConstructorMethod s5= new ConstructorMethod("Michael  ", 1005,"  Math    ", 95);
		s5.display();
	}

}
