package factory.animals;

public class AnimalFactory
{
    public static IAnimal getAnimal(AnimalType type){
        switch(type)
        {
            case BIRD:
                return new Bird();
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new IllegalArgumentException("Animal type: " + type.toString() + " not supported");
        }
    }
            
    public enum AnimalType{
        BIRD,
        CAT,
        DOG,
        POTATO
    }
}
