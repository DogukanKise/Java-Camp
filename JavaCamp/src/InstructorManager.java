
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getId()+" added to the instructor's system");
	}
	
}
