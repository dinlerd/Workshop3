package workshop3;

public class Course {

	private int id;
	private String description;
	private String instructor;
	private String courseImage;
	private double progress;
	
	public Course() {
		
	}
	
	public Course(int id, String description, String instructor, String courseImage, double progress) {
		super();
		this.id = id;
		this.description = description;
		this.instructor = instructor;
		this.courseImage = courseImage;
		this.progress = progress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCourseImage() {
		return courseImage;
	}

	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}
	
	


}
