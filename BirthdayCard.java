package targilim;

public class BirthdayCard extends GreetingCard {
	
	public String recipient;
	protected String sender;
	protected int age;
	
	public BirthdayCard(String recipient, String sender, int age) {
		super(recipient, sender);
		this.age = age;
	}
	
	protected String greetingMsg() {
		return super.greetingMsg() + "\n" + 
			   "Happy " + this.age + "th Birthday";
	}

}
