package symbi;

public class ThreeDot {

	static void Display(String...values)
	{
		for(String st:values)
		{
		System.out.print(st);
		}
	}
	 void dis(int...value)
	 {
		 for(int i : value)
		 {
			 System.out.println(i);
		 }
		 
	 }
	 
	public static void main(String[] args) 
	{
		Display("ved");
		ThreeDot td=new  ThreeDot();
		 //td.Display("vedant");
		td.dis(11);
	}

}
