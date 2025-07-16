package eduSmart;

public class Instructor extends User{
	private String createdCourse1;
	private String createdCourse2; 
	private int coursesCreated = 0;

	Instructor(String name, String email, int userId) {
		super(name, email, userId);
		this.createdCourse1=null;
		this.createdCourse2=null;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewProfile() {
		System.out.println("Instructor name : "+super.getName());
		System.out.println("Instructor email : "+super.getEmail());
		System.out.println("Instructor userID : "+super.getUserId());
	}

	public void createCourse(String courseName) {
		if(coursesCreated<=2) {
			if(createdCourse1 == null) {
				this.createdCourse1=courseName;
				coursesCreated++;
			}
			else if(createdCourse2 == null) {
				this.createdCourse2=courseName;
				coursesCreated++;
			}
		}
		else {
			System.out.println("Maximum limit reached hence course cant be created!!");
		}

	}

}