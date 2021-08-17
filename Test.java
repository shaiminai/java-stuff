package targilim;


public class Test {

	public static void main(String[] args) { 
		/*GreetingCard gc1 = new GreetingCard("recipient1", "sender1");
		BirthdayCard bd1 = new BirthdayCard("recipient2", "sender2", 17);
		WeddingCard wd1 = new WeddingCard("bride1", "groom1", "sender3");
		System.out.println(gc1);
		System.out.println(bd1);
		System.out.println(wd1);
		
		GreetingCard[] gcArr = new GreetingCard[10];
		gcArr[0] = new GreetingCard("recipient", "sender");
		gcArr[1] = new WeddingCard("sender", "bride", "groom");
		gcArr[2] = new BirthdayCard("recipient", "sender", 10);
		gcArr[3] = new YouthBirthday("recipient", "sender", 9);
		gcArr[4] = new AdultBirthday("recipient", "sender", 71);
		gcArr[5] = new GreetingCard("recipient", "sender");
		gcArr[6] = new WeddingCard("sender", "bride", "groom");
		gcArr[7] = new BirthdayCard("recipient", "sender", 10);
		gcArr[8] = new YouthBirthday("recipient", "sender", 15);
		gcArr[9] = new AdultBirthday("recipient", "sender", 100);
		System.out.println(((BirthdayCard)(gcArr[9])).age);
		((AdultBirthday)(gcArr[9])).printAge();
		int cnt = 0;
		for (int i = 0; i < gcArr.length; i++) {
			if (gcArr[i] instanceof AdultBirthday && ((AdultBirthday)(gcArr[i])).isSenior(((AdultBirthday)(gcArr[i])).age)) {
				cnt++;
			}
		}
		System.out.println(cnt + " times");
		System.out.println(((YouthBirthday)(gcArr[3])).age);
		System.out.println(((BirthdayCard)(gcArr[3])).age);
		*/
		
		System.out.println(mystery(123));
	}
	
	public static int mystery(int num)
	{
	if (num < 10)
		return (num);
	else
	{
		int i = 10;
		while (num % i != num)
			i *= 10;
	int x = ((num % 10) * i / 10) + mystery(num / 10);
	System.out.println(x);
	return (x);
	}
	}

}