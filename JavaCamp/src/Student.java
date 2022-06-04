
public class Student extends User{
	private String[] userSubscriptions;
	private int price;
	private String record;
	private String[] linkedAccounts;
	
	public Student() {
		
	}
	public Student(String[] userSubscriptions, int price, String record, String[] linkedAccounts) {
		this.userSubscriptions = userSubscriptions;
		this.price = price;
		this.record = record;
		this.linkedAccounts = linkedAccounts;
	}
	public String[] getUserSubscriptions() {
		return userSubscriptions;
	}
	public void setUserSubscriptions(String[] userSubscriptions) {
		this.userSubscriptions = userSubscriptions;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String[] getLinkedAccounts() {
		return linkedAccounts;
	}
	public void setLinkedAccounts(String[] linkedAccounts) {
		this.linkedAccounts = linkedAccounts;
	}
	
	
	
	
	
}
