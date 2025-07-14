package eduSmart;

public class Admin extends User {

	public Admin() {
		super("Krish","Krish@gmail.com","ID1");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User object1= new Admin();
		Admin object2= new Admin();
		object1.viewprofile();
		object2.removeuser();
	}

	public void removeuser() {

		System.out.println("removing krish");
	}

	@Override
	void viewprofile() {
		// TODO Auto-generated method stub
		System.out.println("Its EduSmart");
	}

}