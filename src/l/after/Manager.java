package l.after;

public class Manager extends Employee implements EmployeeInterface{

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        salary = baseAmount + (rank * 4);
    }
}
