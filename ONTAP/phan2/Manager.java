package phan2;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String jobTitle, double bonus) {
        super(name, age, jobTitle);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call displayInfo() of Employee
        System.out.println("Bonus: " + bonus);
    }
}

