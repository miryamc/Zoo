package Zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) {
		Dog dog =new Dog(true,true, Dog.MOOD_HAPPY);
		Cat cat = new Cat(true,true, Cat.MOOD_SCARE);
		Frog frog = new Frog(false, false, Frog.MOOD_HAPPY);
		List<Animal> animals = Arrays.asList(dog, cat, frog);
		List<Land> lands = Arrays.asList(dog, cat, frog);
		
		for(Animal a : animals){
			a.SayHello();
		}
		
		for(Land l : lands){
			System.out.println(l.GetNumbersOfLegs());
		}
	
	}

}
