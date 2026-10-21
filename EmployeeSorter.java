import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Represents an Employee with a name, age, and salary.
 *
 * @author Joshua Castro
 * @version 1.0
 */
class Employee {
    private String name;
    private int age;
    private double salary;

    /**
     * Constructor for the Employee class.
     */
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Salary: $" + salary + ")";
    }
}
