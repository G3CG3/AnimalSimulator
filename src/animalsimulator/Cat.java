package animalsimulator;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void move() {
        System.out.println(name + " stalks silently.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food.");
    }
}
