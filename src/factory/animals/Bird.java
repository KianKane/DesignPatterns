package factory.animals;

class Bird implements IAnimal
{
    @Override public void speak(){
        System.out.println("Tweet");
    }
}
