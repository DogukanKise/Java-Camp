
public class Instructor extends User {
	private String instructorsProfession;
	private String instructorsDegree;
	private String instructorsUniversity;
	private String[] instructorsLessons;
	
	public Instructor() {
		
	}
	
	public Instructor(String instructorsProfession,String instructorsDegree,
			String instructorsUniversity,String[] instructorsLessons) {
				this.instructorsProfession=instructorsProfession;
				this.instructorsDegree = instructorsDegree;
				this.instructorsUniversity = instructorsUniversity;
				this.instructorsLessons = instructorsLessons;
	}

	public String getInstructorsProfession() {
		return instructorsProfession;
	}

	public void setInstructorsProfession(String instructorsProfession) {
		this.instructorsProfession = instructorsProfession;
	}

	public String getInstructorsDegree() {
		return instructorsDegree;
	}

	public void setInstructorsDegree(String instructorsDegree) {
		this.instructorsDegree = instructorsDegree;
	}

	public String getInstructorsUniversity() {
		return instructorsUniversity;
	}

	public void setInstructorsUniversity(String instructorsUniversity) {
		this.instructorsUniversity = instructorsUniversity;
	}

	public String[] getInstructorsLessons() {
		return instructorsLessons;
	}

	public void setInstructorsLessons(String[] instructorsLessons) {
		this.instructorsLessons = instructorsLessons;
	}
	
	
}
