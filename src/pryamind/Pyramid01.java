package pryamind;

public class Pyramid01 {

	public static void main(String[] args) {
		
		int a = 1;
		
		
		for (int i=0; i<=5; i++)  {
			for (int j = 1; j<=i; j++) {
				
				System.out.print(j);
			}
			System.out.println(i+1);
		}
	}
}