package phan2;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound(); // Abstract method

    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}

