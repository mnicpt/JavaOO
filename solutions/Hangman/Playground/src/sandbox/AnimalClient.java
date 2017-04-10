package sandbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnimalClient {

	public static void main(String[] args) {
		Set<Animal> animals = new HashSet<Animal>();
		animals.add(new Horse());
		animals.add(new Duck());
		animals.add(new Bat());
		
		Cow cow = new Cow();
		animals.add(cow);
		animals.add(cow);

		for(Animal animal : animals) {
			if(animal instanceof Flyable) {
				((Flyable) animal).fly();
			}
			animal.speak();
		}
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("Sum = " + sum);
	}

}
