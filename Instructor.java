package eduSmart;

public class Instructor extends User{
	private String createdcourse1;

	public Instructor() {
		super("Hari","Hari@gmail.com","ID1");
		// TODO Auto-generated constructor stub
	}
	public void createcourse(String coursename) {
		coursename="Manualtesting";
	}
	@Override
	void viewprofile() {
		// TODO Auto-generated method stub
		System.out.println("Hari, has limited exposure");
	}

	public String getCreatedcourse1() {
		return createdcourse1;
	}

	public void setCreatedcourse1(String createdcourse1) {
		this.createdcourse1 = createdcourse1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User object1 = new Instructor();

		object1.viewprofile();

	}

}