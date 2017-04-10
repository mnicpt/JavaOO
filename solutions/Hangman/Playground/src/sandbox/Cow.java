package sandbox;

public class Cow implements Animal {

	@Override
	public void speak() {
		System.out.println("Cow is speaking");
	}

	@Override
	public void walk() {
		System.out.println("Cow is walking");
	}

}
