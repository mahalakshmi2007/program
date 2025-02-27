class Employee {
    private int id;
    private int salary;
    private static int minimum_salary = 5000;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary >= minimum_salary) {
            this.salary = newSalary;
        } else {
            System.out.println("Error: salary cannot be below " + minimum_salary);
        }
    }

    public int getID() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee m = new Employee(1, 15000);
        System.out.println("Salary: " + m.getSalary());
        m.setSalary(20000);
        System.out.println("Salary:"+m.getSalary());
    }
}
