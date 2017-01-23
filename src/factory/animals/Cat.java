package factory.animals;

class Cat implements IAnimal
{
    @Override public void speak(){
        System.out.println("Meow");
    }
}
