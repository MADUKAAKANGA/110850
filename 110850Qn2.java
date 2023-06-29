

class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class main {
    public static void main(String[] args) {
        Employee accountant = new Employee("John Smith", "Accountant", 50000.0);
        Employee programmer = new Employee("Jane Doe", "Programmer", 70000.0);

        System.out.println("Accountant's Details:");
        accountant.displayDetails();

        System.out.println("\nProgrammer's Details:");
        programmer.displayDetails();
    }
}

