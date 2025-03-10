package JavaOOps;


interface College{
	int roll=48;
	String name="hema";
	String aspire="Java Developer";
	
	void LearnSkills();
	
}
interface Course
{
	int courseID=06;
	String courseName="Java";
	
	void ApplySkills();
}
class Aspirant implements College,Course
{

	@Override
	public void ApplySkills() {
		// TODO Auto-generated method stub
		System.out.println("In "+courseName+" course we are practically apply skills on projects");
		
	}

	@Override
	public void LearnSkills() {
		// TODO Auto-generated method stub
		System.out.println("Though aspiring of "+aspire+" learning "+courseName+" in college");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aspirant asp=new Aspirant();
		asp.LearnSkills();
		asp.ApplySkills();

	}

}
