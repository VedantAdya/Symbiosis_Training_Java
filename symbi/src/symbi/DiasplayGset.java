package symbi;

 class Student_1{
	
	
	int roll;
	String name;
	
	public int getRoll()
	{
		return roll;
	}
	public void  setRoll(int nroll) {
		this.roll=nroll;
		
	}
	public String  getName(){
		return name;
	}
	public void setName(String nname)
	{
		this.name=nname;
	}
	public void display(int roll,String name)
	{
		System.out.println("roll is"+ roll);
		System.out.print("name"+name);
	}
	
}
public class DiasplayGset {

	public static void main(String[] args) {
		
		Student_1 st=new Student_1();
		int ol=11;
		//Student st1=new Student ();
		//String me="vedant";
		st.display(1,"vedant");
		
		
	}

}
