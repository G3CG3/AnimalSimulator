package animalsimulator;

public abstract  class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();

    public String getName() {
        return name;
    }
}
