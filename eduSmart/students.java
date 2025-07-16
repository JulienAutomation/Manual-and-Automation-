package eduSmart;

public class students extends User implements ProgressTrackable{
	private  String enrolledCourse1;
	private  String enrolledCourse2;
	private int enrolledCourseCount = 0;

	public students(String name,String email,int userId) {
		super(name, email, userId);
		this.enrolledCourse1=null;
		this.enrolledCourse2=null;
	}
	@Override
	public void viewProfile() {
		System.out.println(super.getName()+" "+super.getEmail()+" "+super.getUserId());
		System.out.println();
	}


	void enrollCourse(String courseName) {
		if(enrolledCourseCount< 2) {
			if(this.enrolledCourse1 == null) {
				this.enrolledCourse1=courseName;
				enrolledCourseCount++;
			}
			else if(this.enrolledCourse2 == null) {
				this.enrolledCourse2 =courseName;
				enrolledCourseCount++;
			}	
		}
		else {
			System.out.println("Sorry! Maximum enrollement count reached, we cannot enroll further");
		}

	}
	@Override
	public void trackProgress() {
		// TODO Auto-generated method stub	
		System.out.println("Progress made so far for " +enrolledCourse1+ " is 75%");
	}
	public String getEnrolledCourse1() {
		return enrolledCourse1;
	}
	public void setEnrolledCourse1(String enrolledCourse1) {
		this.enrolledCourse1 = enrolledCourse1;
	}
	public String getEnrolledCourse2() {
		return enrolledCourse2;
	}
	public void setEnrolledCourse2(String enrolledCourse2) {
		this.enrolledCourse2 = enrolledCourse2;
	}

}
