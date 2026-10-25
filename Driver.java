import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *  Creates ArrayList of employees and then sorts them by age,
 *  if same age then by salary, and if same salary, alphabetically
 *
 *  Source Used:
 *  Comparators: <a href="https://dev.java/learn/language/fp/lambdas/writing-comparators/">...</a>
 *
 * @author Zach Baird
 * @version 1.0
 */

public class Driver {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Zach", 27, 40000));
        employees.add(new Employee("Jack", 25, 50000));
        employees.add(new Employee("Preston", 30, 60000));
        employees.add(new Employee("Josh", 25, 50000));
        employees.add(new Employee("Mack", 22, 35000));


        employees.sort(
                Comparator.comparingInt((Employee e) -> e.getAge())
                        .thenComparing(
                                Comparator.comparingDouble(
                                        (Employee e) -> e.getSalary()
                                ).reversed()
                        )
                        .thenComparing(e -> e.getName())
        );


        for (Employee e : employees) {
            System.out.println(e);


        }


    }
}
