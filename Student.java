package AllModules;

public class Student {
	
	String name;
	int changeYear;
	
	String changeClass;
	
	private int marks;
	int totalStudents;
	

	
	int changeRollnumber;
	String changeCourse;
	double changePercentage;
	
	House h;
	static String college="sasi engineering college";
	
	
	Student()
	{
		
		System.out.println("This is the Page That you Get Student Details");
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	void setName(String name)
	{
		this.name=name;
	}
	void setYear(int year)
	{
		this.changeYear=year;
	}
	void setClass(String changeClass)
	{
		this.changeClass=changeClass;
	}
	void setRollNumber(int number)
	{
		this.changeRollnumber=number;
	}
	void setCourse(String course)
	{
		this.changeCourse=course;
	}
	void setpercentage(double per)
	{
		this.changePercentage=per;
	}
	void setHouse(House house)
	{
		this.h=house;
	}
	
	String getName()
	{
		return name;
	}
	int getyear()
	{
		return changeYear;
	}
     String getChClass()
	{
		return changeClass;
	}
	int getRollNumber()
	{
		return changeRollnumber;
	}
	String getCourse()
	{
		return changeCourse;
	}
	double getPercentage()
	{
		return changePercentage;
	}
	House getHouse()
	{
		return h;
	}

}
