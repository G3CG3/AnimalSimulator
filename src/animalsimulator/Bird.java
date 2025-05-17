package animalsimulator;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }

    @Override
    public void move() {
        System.out.println(name + " flies in the sky.");
    }

    @Override
    public void eat() {
        System.out.println(name + " pecks at seeds.");
    }
}
