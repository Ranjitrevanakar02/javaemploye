package java1;
public class test {
    private int id;
    private String name;
    private double salary;

    public test(int id, String name, double salary) {
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
        test emp = new test(101, "Alice Johnson", 75000.00);
        emp.printDetails();
    }
}
