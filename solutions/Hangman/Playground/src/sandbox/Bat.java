package sandbox;

public class Bat implements Animal, Flyable {

	@Override
	public void fly() {
		System.out.println("Bat is flying");
	}

	@Override
	public void speak() {
		System.out.println("Bat is speaking");
	}

	@Override
	public void walk() {
		System.out.println("Bat is hanging");
	}

}
