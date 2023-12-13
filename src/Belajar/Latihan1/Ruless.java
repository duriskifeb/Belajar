package Belajar.Latihan1;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
    }
}

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void manageTeam() {
        System.out.println(getName() + " is managing the team.");
    }
}

public class Ruless {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
        Manager manager = new Manager("Alice");

        employee.work();
        employee.attendMeeting();

        manager.work();
        manager.attendMeeting();
        manager.manageTeam();
    }
}
