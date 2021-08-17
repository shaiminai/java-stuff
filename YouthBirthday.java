package targilim;

public class YouthBirthday extends BirthdayCard {
	
	protected String recipient;
	protected String sender;
	protected int age;
	
	public YouthBirthday(String recipient, String sender, int age) {
		super(recipient, sender, age);
	}
	
	protected String greetingsMsg() {
		return "Happy " + super.age + "th Birthday!\n" + 
	"How you have grown!!";
	}

}
