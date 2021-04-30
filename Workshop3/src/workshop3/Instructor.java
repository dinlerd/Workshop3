package workshop3;

public class Instructor extends User{
	private String biography;
	
	public Instructor() {
		
	}
	
	public Instructor(String biography) {
		super();
		this.biography = biography;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
	
}
