import java.util.Scanner;



public class ConditionWithScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student1 mark");
		int a = sc.nextInt();
		
		
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student2 mark");
		int b = s.nextInt();
		
		Scanner sx = new Scanner(System.in);
		System.out.println("Enter the Student3 mark");
		int c = sx.nextInt();   */
		
		
	// for (a= int a = sc.nextInt(), a>90 ||a<=90 && a>=75 || a<=75 && a>=50 ,  a++ ) {	
		
		if ( a>90) 
		{
		
		System.out.println("Student1 Grade A :"+ a);
		
       }else  if (a<=90 && a>=75) {
    	  // System.out.println("grade B");	 
    	   
    	   System.out.println("Student1 Grade B :"+ a);
    	   
       } else if (a<=75 && a>=50) {
    	   System.out.println("Student1 Grade C :"+ a);
    	   
    	          }
       
       else {
    	   System.out.println("fails");
    	   
//	}
	}
		
	}
}	
	/*	Scanner x = new Scanner(System.in);
		System.out.println("Enter the Student3 mark");
		int c = x.nextInt();
		
		
		System.out.println();
		
		
		
       {
    	   System.out.println("grade b");
       } else if (c>65)
       {
    	   System.out.println("grade c");
       } else 
       {
    	   System.out.println("fail");
       }        */
		
				


