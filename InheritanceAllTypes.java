package JavaOOps;




class Student {
    int roll;
    String name;
    String branch;

    // Constructor to initialize Student
    Student(int roll, String name, String branch) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
    }

    void studies() {
        System.out.println(name + " is studying " + branch);
    }
}
//single inheritance ................
class Engineer extends Student {
    int idno;

    // Constructor to initialize Engineer
    Engineer(int roll, String name, String branch, int idno) {
        super(roll, name, branch); // Calling the parent constructor
        this.idno = idno;
    }

    void display() {
        System.out.println("Engineer ID: " + idno + ", Name: " + name + ", Roll: " + roll + ", Branch: " + branch);
    }
}
//hierarchichal inheritance.........
class StartUpOwner extends Student
{
	String companyName;

	StartUpOwner(int roll, String name, String branch,String companyName) {
		super(roll, name, branch);
		// TODO Auto-generated constructor stub
		this.companyName=companyName;
	}
	void display()
	{
		System.out.println(name+" is Owner of the "+companyName);
	}
}
// MultiLevel Inheritance.............
class Entrepreneur extends StartUpOwner
{
	String busnsType;

	Entrepreneur(int roll, String name, String branch,String busnsType) {
		super(roll, name, branch, busnsType);
		// TODO Auto-generated constructor stub
		this.busnsType=busnsType;
	}
	void dispaly() {
		System.out.println(name+" had Bussiness Type of "+busnsType);
	}

	
	
}

public class InheritanceAllTypes {
    public static void main(String[] args) {
        Engineer eng = new Engineer(101, "Alice", "Computer Science", 13);
        eng.display();
        eng.studies();
        StartUpOwner own=new StartUpOwner(48,"hema","CST","FindSolutions");
        own.display();
        Entrepreneur ent=new Entrepreneur(48,"Hemavardhani","CST","Monopoly");
        ent.dispaly();
        
    }
}

