package workshop3;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getDescription() + " added.");
	}
	
	public void delete(Course course) {
		System.out.println(course.getDescription() + " deleted.");
	}
	
	public void listCourse(Course[] courses) {
		for (Course course : courses) {
			System.out.println(course.getDescription());
		}

	}
}
