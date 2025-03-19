package JavaOOps;
import java.util.Scanner;

public class UnCheckedExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the value  of numerator");
		int a=sc.nextInt();
		System.out.println("Enter the value of denominator ");
		int b=sc.nextInt();
		int c=0;
		
		
		try
		{
			if(b==0)
			{
				throw new ArithmeticException("division by zero not allowed please carefully eneter the denominator value");
			}
			c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("occurred Arithmetic exception"+e.getMessage());
		}
		finally
		{
			System.out.println("Alway excutable");
		}
		
		System.out.println("divison answer is "+c);
		

	}

}
