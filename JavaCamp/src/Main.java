
public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		StudentManager manager = new StudentManager();
		Instructor instructor = new Instructor();
		Student student = new Student();
		
		instructor.setId(5);
		userManager.add(instructor);
		String[] lessons = {"Math","Physics","Sport","Coding"};
		String[] linkedAccounts = {"Github","Linkedin","Stackoverflow","Facebook"};
		
		manager.addLesson(linkedAccounts);
		userManager.addLesson(lessons);
		
	}

}
