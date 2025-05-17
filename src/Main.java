import animalsimulator.Animal;
import animalsimulator.Bird;
import animalsimulator.Cat;
import animalsimulator.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");

        Animal[] animals = { dog, cat, bird };

        for (Animal animal : animals) {
            System.out.println("---");
            System.out.println("Animal: " + animal.getName() + " is a " + animal.getClass().getSimpleName());
            animal.makeSound();
            animal.move();
            animal.eat();
        }
    }
}