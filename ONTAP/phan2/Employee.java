package phan2;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age); // Call constructor of Person class
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call displayInfo() of Person
        System.out.println("Job Title: " + jobTitle);
    }
}

