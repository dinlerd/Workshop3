package workshop3;

public class InstructorManager extends UserManager{

	public void openCourse(Course course) {
		System.out.println(course.getDescription() + " opened.");
	}
	
	public void closeCourse(Course course) {
		System.out.println(course.getDescription() + " closed.");
	}
	
}
