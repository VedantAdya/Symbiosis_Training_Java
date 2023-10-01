package symbi;

class human{
	
	
	public void eat()
	{
		System.out.println("human is eatig ");
	}
}


public class Overrid extends human {

	
	public void eat()
	{
		System.out.println("boy is eating ");
	}
	public static void main(String[] args) {
		 
		Overrid  ov =new Overrid();
		ov.eat();

	}

}
