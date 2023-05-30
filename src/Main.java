import animal.Animal;
import animal.AnimalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //Scanner scanner = new Scanner(System.in);

            PrimitiveTypes primitive = new PrimitiveTypes();
            primitive.run();

            ClassBasics basics = new ClassBasics();
            //String userInput = scanner.nextLine();
            System.out.println(basics.inputChaining("test"));

            ClassConstructors singleArg = new ClassConstructors(1);
            ClassConstructors doubleArg = new ClassConstructors(2, 3);

            System.out.println(ClassBasics.numMult(3));

            AnimalFactory animalFactory = new AnimalFactory();

            Animal dog = animalFactory.createAnimal("dog");
            dog.makeSound();

            Animal cat = animalFactory.createAnimal("cat");
            cat.makeSound();


        }
    }
