package java1;

public class Employee23 {
    private int id;
    private String name;
    private double salary;

    public Employee23(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee23 emp = new Employee23(101, "Alice Johnson", 75000.00);
        emp.printDetails();
    }
}
