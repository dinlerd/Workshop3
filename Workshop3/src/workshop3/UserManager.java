package workshop3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " updated.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " deleted.");
	}
	
	public void get(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " listed.");
	}
}
