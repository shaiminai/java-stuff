package targilim;

public class AdultBirthday extends BirthdayCard {
	
	protected String recipient;
	protected String sender;
	protected int age;
	
	public AdultBirthday(String recipient, String sender, int age) {
		super(recipient, sender, age);
	}
	
	public void printAge() {
		System.out.println(super.age);
	}
	
	protected String greetingsMsg() {
		return "Happy " + super.age + "th Birthday!\n" + // why super.age and not this.age?????
	"You haven't changed at all!!";
	}
	
	public boolean isSenior(int age) {
		return super.age > 70;
	}

}
