
public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getId()+" added to the student's system");
	}
	public void showLinkedAcc(String[] linkedAccounts) {
		
	}
}
