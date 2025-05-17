package animalsimulator;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs around happily.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }
}
