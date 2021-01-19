

public class NestedIf {

	 
	
	public static void main(String[] args) {
		
		int age = 25;
		int height = 174;
		

		if ( age >= 25 && height >= 175 ) {
			System.out.println(" Direct Selected ");	
		
			if  (age >= 25 || height >= 175) {
				System.out.println(" selected for first round");
			} 
			else {
				System.out.println("not selected ");
			}
			
			
		}			
			else {
				System.out.println("eleminated");
			}
		}
	}

