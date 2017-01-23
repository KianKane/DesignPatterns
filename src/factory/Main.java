package factory;

import factory.animals.IAnimal;
import factory.animals.AnimalFactory;

public class Main
{
    public static void main(String[] args){
        System.out.println("\n--- Testing Animal Factory ---");
        IAnimal bird = AnimalFactory.getAnimal(AnimalFactory.AnimalType.BIRD);
        IAnimal cat = AnimalFactory.getAnimal(AnimalFactory.AnimalType.CAT);
        IAnimal dog = AnimalFactory.getAnimal(AnimalFactory.AnimalType.DOG);
        bird.speak();
        cat.speak();
        dog.speak();
    }
}
