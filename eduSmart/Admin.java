package eduSmart;

public class Admin extends User {
	Admin(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewProfile() {
		System.out.println("Admin name : "+super.getName());
		System.out.println("Admin email : "+super.getEmail());
		System.out.println("Admin userID : "+super.getUserId());
	}

	void removeUser(User user) {
		System.out.println("Removed user : " + user.getName());
	}

}

interface ProgressTrackable {
	void trackProgress();
}

