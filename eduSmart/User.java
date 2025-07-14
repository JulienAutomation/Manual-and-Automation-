package eduSmart;

public abstract class User {
	private String name;
	private String email;
	private String userID;
	abstract void viewprofile();

	final void displayWelcome() {System.out.println("Welcome to EduSmart......");
	}
	public User(String name,String email,String userID) {
		this.setName(name);
		this.setEmail(email);
		this.setUserID(userID);
	}

	public User(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}