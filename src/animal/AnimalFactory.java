package animal;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}
