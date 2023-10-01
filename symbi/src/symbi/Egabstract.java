package symbi;
abstract class demo
{
	abstract void Display();
		
	
}
public class Egabstract extends demo {

	public void Display() {
		System.out.println("on extended");
	}
	
	public static void main(String arg[])	
	{
		 demo obj=new Egabstract();
		 obj.Display();
		
	}

	



	
}
