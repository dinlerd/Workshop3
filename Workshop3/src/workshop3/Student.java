package workshop3;

public class Student extends User{
	private String studentId;

	public Student() {
		
	}
	
	public Student(String studentId) {
		super();
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
