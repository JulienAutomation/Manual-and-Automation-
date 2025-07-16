package eduSmart;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("EduSmart - A Mini Learning Management System"); 
		students student1 = new students("Julien ","Julien42@gmail.com",01);
		students student2 = new students("Kevin ","Kevin12@gmail.com",02);

		Instructor instructor1 = new Instructor("Sandesh","Sandesh99@gmail.com",100);
		Instructor instructor2 = new Instructor("Ravi","Ravi@gmail.com",101);

		Admin admin1 = new Admin("Rakshay","Rakshay@gmail.com",200);

		student1.displayWelcome();
		student2.displayWelcome();

		//		instructor1.displayWelcome();
		//		instructor2.displayWelcome();

		//		admin1.displayWelcome(); 

		instructor1.createCourse("Java");
		instructor1.createCourse("Java with selenium");
		instructor2.createCourse("C++");
		instructor2.createCourse("Core Java");
		instructor2.createCourse("Python with Selenium");

		instructor1.viewProfile();
		instructor2.viewProfile();

		student1.enrollCourse("Java");
		student1.enrollCourse("C++");
		student2.enrollCourse("Java");
		student2.enrollCourse("Selenium");
		student2.enrollCourse("Python");

		student1.viewProfile();
		student2.viewProfile();
		admin1.viewProfile();

		student1.trackProgress();
		student2.trackProgress();

		admin1.removeUser(student2);

		Course course1 =new Course("Java with Selenium ", 11, 1);
		course1.showCourseDetails();
		Course course2 = new Course("Python using AI ", 10, 2);
		course2.showCourseDetails();

	}


}


