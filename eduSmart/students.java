package eduSmart;

public class students extends User implements ProgressTrackable{
	private String enrolledcourse1;
	private String enrolledcourse2;

	public students() {
		super("Hari","Hari@gmail.com","ID1");



		// TODO Auto-generated constructor stub
	}
	public void enrolledcourse(String coursename) {
		coursename="Manualtesting";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User object1 = new students();
		ProgressTrackable object2 = new students();
		object1.displayWelcome();
		object1.viewprofile();
		object2.trackprogress();
	}

	@Override
	void viewprofile() {
		System.out.println("Hari,Hari@gmail.com,ID1");
		// TODO Auto-generated method stub

	}


	public String getEnrolledcourse1() {
		if(enrolledcourse1== "Manualtesting")
		{System.out.println("Manualtesting");
		}
		return enrolledcourse1;
	}



	public void setEnrolledcourse1(String enrolledcourse1) {
		this.enrolledcourse1 = enrolledcourse1;
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
		System.out.println("student1 enrolled course"+getEnrolledcourse1()+getEnrolledcourse2());
	}

}
