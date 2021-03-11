import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ( (Employee)o ).age;
    }
}

public class RegularComparable {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Kriss", 20));
        list.add(new Employee("Ashkan", 30));
        list.add(new Employee("XiaoYu", 18));
        list.add(new Employee("Carson", 19));
        list.add(new Employee("Tarl", 24));
        list.add(new Employee("Mofa", 26));

        System.out.println("!!! before sorting: --- ");
        for (Employee e : list) {
            System.out.println(e.name);
        }
        System.out.println("--- end list: --- ");

        System.out.println("!!! after sorting: --- ");
        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e.name);
        }
        System.out.println("--- end list: --- ");

    }

}
