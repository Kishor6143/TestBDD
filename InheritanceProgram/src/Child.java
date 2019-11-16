 class Parent
{
	public void disp()
	{
		System.out.println("Parent class");
		System.out.println("Test Commit");
		
	}
	public void add()
	{
	System.out.println("Add method in parent class");	
	}

}

 public class Child extends Parent
{

	public void disp()
	{
		System.out.println("Child class");
	
	}
	public void sub()
	{
		System.out.println("sub method in child class");
	}
	public static void main(String[] args)
	{
		Child ch = new Child();
		ch.disp();
		ch.add();
		ch.sub();
		Parent pr= new Child();
		pr.add();
        pr.disp();
        Parent prch= new Parent();
        prch.add();
        prch.disp();


	}

}
