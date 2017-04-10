package sandbox;

public class Horse implements Animal {

	@Override
	public void speak() {
		System.out.println("Horse is speaking");
	}

	@Override
	public void walk() {
		System.out.println("Horse is walking");
	}

}
