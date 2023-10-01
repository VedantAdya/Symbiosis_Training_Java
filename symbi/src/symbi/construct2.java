package symbi;

public class construct2 {
	
	
	int id;
	String name;
	construct2(int i,String nam){
		id=i;
		name=nam;
	}
	void display()
	{
		System.out.println(id+"and "+name);
	}
	public static void main (String ar[])
	{
		
		construct2 ct=new construct2(11,"ved");
		ct.display();
		
		
	}

}
