package workshop3;

public class StudentManager extends UserManager {

	public void registerCourse(Student student, Course course) {
		System.out.println(student.getFirstName() + " registered for " + course.getDescription() );
	}
	
	public void listCourse(Student student, Course[] courses) {
		for (Course course : courses) {
			System.out.println(student.getFirstName() + " has course: " + course.getDescription() );
		}
	}
}
