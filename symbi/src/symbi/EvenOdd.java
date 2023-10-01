package symbi;
import java.util.*;


public class EvenOdd {

	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		eod(n);
		
		
	}

	
	
	
	
	public static void eod(int num) {
		if(num%2==0)
		{
			System.out.println(num+"is even ");
		}
		else {
			System.out.println("odd number");
		}
	}
	
}
