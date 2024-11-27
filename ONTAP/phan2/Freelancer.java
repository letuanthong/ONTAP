package phan2;

public class Freelancer implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

