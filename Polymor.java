package JavaOOps;

public class Polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		COMPILE TIME .....................................
		Compile c=new Compile();
		c.add(10,5);
		c.add(19);
		
//		RUNTIME........................
		Child c1;
		c1=new Childs();
		System.out.println(c1.Mes(5));
		
		
		
		
	}
}
	//COMPILE TIME POLYMORPHISM.....................
 class Compile{
	 

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a)
	{
		System.out.println(a);
	}

 }
//RUN TIME POLYMORPHISM.......................
class Child {

	
	public int Mes(int a)
	{
		return a;
	}
}
class Childs extends Child
{
	@Override
	public int Mes(int a)
	{
		return a;
	}
}

