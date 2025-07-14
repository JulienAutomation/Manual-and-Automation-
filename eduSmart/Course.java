package eduSmart;

public class Course {
	static String title= "Softwaretesting";
	int durationinhours= 3;
	int maxstudents =25;
	public Course(String acceptstitle, int duration, int maximunstudents) {
		title =acceptstitle;
		durationinhours= duration;
		maxstudents= maximunstudents;
	}
	public Course(String acceptsonlytitle) {
		title =acceptsonlytitle;

	}
	public void showCoursedetails() {

		System.out.println(title+ " course for freshers");

		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course object1 = new Course(title);


		object1.showCoursedetails();
	}}