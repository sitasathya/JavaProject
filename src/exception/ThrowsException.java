package exception;
import java.io.FileNotFoundException; 
import java.io.FileInputStream;

public class ThrowsException {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		ThrowsException t= new ThrowsException();
		t.m1();
		
		
	}

	void m1()throws FileNotFoundException{
		
		readfile ();
			
		}
		
	void readfile() throws FileNotFoundException{
		
		FileInputStream fs= new FileInputStream("C:\\Users\\sathyasgobi\\Desktop\\java program");
	// readfile method not using try catch.
	//delegate the responsiblity to the caller. m1()	
		
	}
	
}
