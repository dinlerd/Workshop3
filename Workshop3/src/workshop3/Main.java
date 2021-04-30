package workshop3;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# + Angular","Engin Demiroğ","/courseImage1.jpg", 0);
		Course course2 = new Course(2,"Java + React","Engin Demiroğ","/courseImage2.jpg", 0);
		
		Course[] courses = new Course[] {
				course1,
				course2
		};
		
		System.out.println("Course list: ");
		
		for (Course course : courses) {
			System.out.println(course.getDescription());
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.delete(course2);
		courseManager.listCourse(courses);

		User user1 = new User();
		user1.setFirstName("D");
		user1.setLastName("D");
		
		User user2 = new User();
		user2.setFirstName("Engin");
		user2.setLastName("Demiroğ");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.add(user2);
		
		Instructor instructor1 = new Instructor("MCT,PMP,ITIL");
		
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		instructorManager.get(instructor1);
		instructorManager.openCourse(course1);
		instructorManager.openCourse(course2);
		
		Student student1 = new Student();
		student1.setFirstName("D");
		student1.setLastName("D");
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(student1, course1);
		studentManager.registerCourse(student1, course2);
		studentManager.listCourse(student1, courses);
		
	}

}
