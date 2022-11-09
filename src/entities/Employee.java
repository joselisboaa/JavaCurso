package entities;

public class Employee {
    public String name;
    public double grossSalary;

    public double tax;

    private double discountTax() {
        return this.grossSalary - this.tax;
    }

    public String employeeData() {
        discountTax();
        return "Employee: "
                + name
                + ", $ "
                + discountTax();
    }

    public double salaryIncrease(double percentage) {
        return this.grossSalary += (this.grossSalary * percentage / 100);
    }

    public void newData() {
        System.out.println("Updated data: " + name + ", $ " + discountTax());
    }
}
