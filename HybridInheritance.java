package JavaOOps;

interface Mammal
{
	void live();
}
interface Animal
{
	void behave(); 
}
class Dog implements Animal
{

	@Override
	public void behave() {
		// TODO Auto-generated method stub
		System.out.println("Animals Behaves trust worthy");
		
	}
	
}
class Puppy extends Dog implements Mammal
{

	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.println("Mammals are live in land");
		
	}
	
}
public class HybridInheritance {
	public static void main(String args[])
	{
		Puppy p=new Puppy();
		p.behave();
		p.live();
	}

}
