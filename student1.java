class student1
{
	int rollno;
	String name;
	student1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name);
	}
	public static void main(String args[])
	{
		student1 s1 = new student1(1,"Desti");
		student1 s2 = new student1(2,"sona");
		s1.display();
		s2.display();
		
	}
	
}