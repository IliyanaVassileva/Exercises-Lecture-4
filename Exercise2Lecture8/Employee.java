package Exercise2Lecture8;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public double raiseSalary(double percent) {
        double raiseAmount = (percent / 100) * salaryPerMonth;
        salaryPerMonth += raiseAmount;
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
                "\nName: " + getName() +
                "\nSalary per Month: $" + salaryPerMonth +
                "\nAnnual Salary: $" + getAnnualSalary();
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Iliyana", "Vasileva", 5000.0);

        System.out.println("Employee Information:");
        System.out.println(employee);

        System.out.println("\nRaising Salary by 10%...");
        employee.raiseSalary(10.0);

        System.out.println("\nUpdated Employee Information:");
        System.out.println(employee);
    }
}
