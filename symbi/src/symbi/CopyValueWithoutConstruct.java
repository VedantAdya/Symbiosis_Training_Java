package symbi;

public class CopyValueWithoutConstruct {

int id;
String name;
	
	CopyValueWithoutConstruct(int i,String st)

	{
		 id=i;
		name=st;
		
	}
	CopyValueWithoutConstruct()	{}
	void display() {System.out.println(name+" "+id);}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyValueWithoutConstruct ct=new CopyValueWithoutConstruct(11,"ved");
		CopyValueWithoutConstruct ct2=new CopyValueWithoutConstruct();

		 ct.id=ct2.id;
		 ct.name=ct2.name;
		 
		 ct2.display();
		 ct.display();
	}

}
