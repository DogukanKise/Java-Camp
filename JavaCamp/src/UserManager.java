
public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" added to the system");
	}
	
	public void addLesson(String[] lessons) {
		for(int i = 0;i<lessons.length;i++) {
			System.out.println(lessons[i]+" eklendi");
		}
		
	}
}
