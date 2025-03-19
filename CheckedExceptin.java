package JavaOOps;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example for file not found exception.......
		try
		{
			FileReader file=new FileReader("test.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found first create a file called test.tx"+e.getMessage());
		}
		

	}

}
