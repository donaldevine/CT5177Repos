package testproject;

public class TestClass {
	public static void main(String[] args) {
		String s1 = "Java";
		String s3 = "Test";
		String s2 = new String("Java");
		
		String s4 = "Java";
		String s5 = "Java";
		
		if(s1 == s2) {			
			System.out.println("s1 and s2 are equal using reference compare");
		} else {
			System.out.println("s1 and s2 are NOT equal using reference compare");
		}
		
		
		if(s1.equals(s2)) {			
			System.out.println("s1 and s2 are equal using contents compare");
		} else {
			System.out.println("s1 and s2 are NOT equal using contents compare");
		}
				

		if(s1 == s3) {			
			System.out.println("s1 and s3 are equal using reference compare");
		} else {
			System.out.println("s1 and s3 are NOT equal using reference compare");
		}
		
		if(s4 == s5) {			
			System.out.println("s4 and s5 are equal using reference compare");
		} else {
			System.out.println("s4 and s5 are NOT equal using reference compare");
		}
	}
}
