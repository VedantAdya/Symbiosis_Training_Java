// java program to overload constructor 
package symbi;

public class overloadconstructor {
	int id;
	String name;
	int mob;
	overloadconstructor(int i,String str)
	{
		id=i;
		name=str;
		
	}
/*	overloadconstructor(int i,String st,int m)
	{
		id=i;
		st=name;
		mob=m;
		
	}*/
	overloadconstructor(overloadconstructor o)
	{
		id=o.id;
		name=o.name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadconstructor ov=new overloadconstructor(11,"Ved");
		overloadconstructor ov2=new overloadconstructor(ov);
	//	overloadconstructor ov1=new overloadconstructor(11,"Ved",111);
	//	ov.display();
		ov2.display();
		//ov1.display();
	}

}
