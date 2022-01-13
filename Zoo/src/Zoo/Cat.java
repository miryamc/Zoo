package Zoo;

public class Cat extends Animal implements Land{

	public static int NumbersOfLegs = 4;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(boolean isMammals, boolean isCarnivorous, int mood) {
		super(isMammals, isCarnivorous, mood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SayHello() {
		this.SayHello(this.getMood());
	}

	@Override
	public void SayHello(int mood) {
		switch(mood) {
		case Animal.MOOD_HAPPY: System.out.println("purr, purr"); // when they are in a good mood.
		break;
		case Animal.MOOD_SCARE: System.out.println("hiss"); // when they are frightened.
		break;
		default: System.out.println("meow"); // when they greet people usually.
		}
	}

	@Override
	public int GetNumbersOfLegs() {
		return this.NumbersOfLegs;
	}
	
}
