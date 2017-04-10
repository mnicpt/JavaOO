package sandbox;

public class Duck implements Animal, Flyable {

	@Override
	public void fly() {
		System.out.println("Duck is flying.");
	}

	@Override
	public void speak() {
		System.out.println("Duck is speaking");
	}

	@Override
	public void walk() {
		System.out.println("Duck is walking");
	}

}
