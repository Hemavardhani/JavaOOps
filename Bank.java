package JavaOOps;

 interface Banks {
   
	public int idno=20;
	static String name="hema";
	final String designation="cashier";
	
	 void deposit() ;
	 void withDarw();
	 void slip();
	 
	 default void lunchBreak()
	 {
		 System.out.println("Its time to lunch");
	 } 
	 static void closeTime()
	 {
		 System.out.println("Its time to close");
	 }
	 
}
abstract class Reception implements Banks{
	void withDraw()
	{
		System.out.println("WithDrwaing money");
	}
	
}


	abstract class Reception1 extends Reception{
	  public   void deposit()
	    {
		System.out.println("deposit money");
	}
}
 class Reception2 extends Reception1{
	public void slip()
	{
		
	}

	@Override
	public void withDarw() {
		// TODO Auto-generated method stub
		
	}
}
class Bank{
	public static void main(String args[])
	{
		
		Reception2 r=new Reception2();
		r.deposit();
		r.slip();
		r.withDraw();
		r.lunchBreak();
		Banks.closeTime();
	}
}