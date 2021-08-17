package targilim;

public class WeddingCard extends GreetingCard {
	
	protected String bride;
	protected String groom;
	protected String sender;
	protected String recipient;
	
	public WeddingCard(String bride, String groom, String sender) {
		super(bride + " & " + groom, sender);
		this.bride = bride;
		this.groom = groom;
	}
	
	public void setRecipient(String bride, String groom) {
		this.bride = bride;
		this.groom = groom;
	}
	
	protected String greetingMsg() {
		return "May you live happily ever after";
	}

}
