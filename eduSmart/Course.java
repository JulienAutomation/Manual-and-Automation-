package eduSmart;
class Course{
	private  String title;
	private  int durationInHours;
	final int maxStudents;

	public Course(String title,int durationInHours,int maxStudents){
		this.maxStudents = 0;
		this.title=title;
		this.durationInHours=durationInHours;
	}
	public Course(String title) {
		this.title=title;
		this.durationInHours=0;
		this.maxStudents=0;
	}
	public void showCourseDetails() {
		System.out.println("Title: "+title);
		System.out.println("Duration in hours: "+durationInHours);
		System.out.println("Max students: "+maxStudents);
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
