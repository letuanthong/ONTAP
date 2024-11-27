package phan2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.displayInfo();

        Employee employee = new Employee("Bob", 35, "Developer");
        employee.displayInfo();

        Manager manager = new Manager("Charlie", 40, "Team Lead", 5000);
        manager.displayInfo();

        Animal dog = new Dog("Buddy");
        dog.displayInfo();
        dog.makeSound();

        Freelancer freelancer = new Freelancer(50, 40);
        System.out.println("Freelancer Pay: " + freelancer.calculatePay());
    }
}
