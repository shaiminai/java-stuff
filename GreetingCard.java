package targilim;

public class GreetingCard {
	
	public String recipient;
	protected String sender;
	
	public GreetingCard(String recipient, String sender) {
		this.recipient = recipient;
		this.sender = sender;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	protected String greetingMsg() {
		return "Best Greetings!";
	}
	
	public String toString() {
		return "Dear " + this.recipient + "\n" + 
				greetingMsg() + "\n" + 
				this.sender;
	}
	

}