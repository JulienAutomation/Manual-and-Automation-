package eduSmart;

public class Instructors extends User{
	private String createdcourse2;

	public Instructors() {
		super("Krish","Krish@gmail.com","ID1");
		// TODO Auto-generated constructor stub
	}
	public void createcourse(String coursename) {
		coursename="automationtesting";
	}
	@Override
	void viewprofile() {
		// TODO Auto-generated method stub
		System.out.println("Julien, 5 odd years of experience");
	}

	public String getCreatedcourse2() {
		return createdcourse2;
	}

	public void setCreatedcourse2(String createdcourse1) {
		this.createdcourse2 = createdcourse1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User object1 = new Instructors();

		object1.viewprofile();


	}
}