package JavaOOps;

 abstract class Abstracts {
	int age;
	static String name;
	final Double salary=50000.09;
	
	abstract void work();
	void workingCompany()
	{
		System.out.println("Atlassian");
	}
	public void display()
	{
		System.out.println("It is a concrete method in abstraction");
	}
	
	

}
class Designs extends Abstracts{
	@Override
	void work() {
		System.out.println("Java Developer");
	}
}
public class Abstract{
	public static void main(String args[])
	{
		Abstracts e=new Designs();
		e.work();
		e.workingCompany();
		e.display();
	}

}
