package stringPrograms;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Java is simple language";
		String s1= "Java is Simple language";
		String s3=" ";
		String s4=" C /is not a simple / Language";  
				
		System.out.println(s.charAt(5)); 
		//charAt -returns char value for the particular index
		
		System.out.println(s.substring(5));
		// substring -returns the substring for given begin index
		
		System.out.println(s.substring(5,19));
		
		System.out.println(s.contains(s1));
		// returns the true or false after matching sequence of the char value
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		//returns the true or false after matching sequence of the char value ignoring case
		
		System.out.println(s3.isEmpty());
		//returns false as there is space
		
		System.out.println(s3.isBlank());
		// returns true looking for char not space.
		
		System.out.println(s1.concat(s4));
		//concatenates the specified string.
		
		System.out.println(s1.replace('a','A'));
		
		// replace the char value a as A
		
		System.out.println(s3.replace(" ","A"));
		//replace the space as A
		
		
		String StrArr[]= s4.split("/"); // splits each string after specified char Value
		for(int i=0; i< StrArr.length; i++) {
			System.out.println(StrArr[i]);
		}
	}

}
