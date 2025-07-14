package eduSmart;

public class Student2 extends User implements ProgressTrackable{
	private String enrolledcourse1;
	private String enrolledcourse2;

	public Student2() {
		super("Judy","Judy96pius@gmail.com","ID2");



		// TODO Auto-generated constructor stub
	}


	public void enrolledcourse(String coursename) {
		coursename="automationtesting";}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User object1 = new Student2();
		ProgressTrackable object2 = new Student2();
		object1.displayWelcome();
		object1.viewprofile();
		object2.trackprogress();
	}

	@Override
	void viewprofile() {
		System.out.println("Judy,Judy96pius@gmail.com,ID2");
		// TODO Auto-generated method stub

	}


	public String getEnrolledcourse1() {
		return enrolledcourse1;
	}


	public void setEnrolledcourse2(String enrolledcourse2) {
		this.enrolledcourse2 = enrolledcourse2;
	}
	public String getEnrolledcourse2() {
		return enrolledcourse2;
	}

	@Override
	public void trackprogress() {
		// TODO Auto-generated method stub
		System.out.println("student2 enrolled course1");
	}
	public void setEnrolledcourse1(String enrolledcourse1) {
		this.enrolledcourse1 = enrolledcourse1;
	}

}