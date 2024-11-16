// Question 12: Write a Java program to create a base class named Employee, which contains an employee ID and a method to display the ID.
// Derive two classes named Manager and Developer from Employee. Manager class should have a method to display manager-specific responsibilities,
// and Developer class should have a method to display developer-specific skills. Demonstrate the working of these classes.

class Employee {
    int employeeID;

    public Employee(int employeeID) {
        this.employeeID = employeeID;
    }

    void displayID() {
        System.out.println("Employee ID: " + employeeID);
    }
}

class Manager extends Employee {
    public Manager(int employeeID) {
        super(employeeID);
    }

    void displayResponsibilities() {
        System.out.println("Manager Responsibilities: Managing team, overseeing projects, and ensuring targets are met.");
    }
}

class Developer extends Employee {
    public Developer(int employeeID) {
        super(employeeID);
    }

    void displaySkills() {
        System.out.println("Developer Skills: Writing code, debugging, and developing software solutions.");
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager(101);
        Developer developer = new Developer(102);

        System.out.println("Manager Details:");
        manager.displayID();
        manager.displayResponsibilities();

        System.out.println("\nDeveloper Details:");
        developer.displayID();
        developer.displaySkills();
    }
}
