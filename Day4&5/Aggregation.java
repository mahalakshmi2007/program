import java.util.List;
import java.util.Arrays;
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }}
class Department {
    private List<Employee> employees;
    public Department(List<Employee> employees) {
        this.employees = employees;
    }
    public void showEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }}}
public class Aggregation {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Maha");
        Employee emp2 = new Employee("sree");
        Department department = new Department(Arrays.asList(emp1, emp2));
        department.showEmployees();
    }}
