import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
    public static void main(String[] args) {
        Employee a1 = new Employee("A", "B", 1, 49000);
        Employee a2 = new Employee("C", "D", 1, 149000);
        Developer a3 = new Developer("E", "F", 75000, "C++",  "University");
        Employee a4 = new Employee("G", "H", 1, 89000);
        ArrayList<Employee> lst = new ArrayList<>();
        lst.add(a1);
        lst.add(a2);
        lst.add(a3);
        lst.add(a4);
        printAllEmployeesOrderBySalary(lst);
        System.out.println("\n");
        printAllEmployees(lst);
    }
    public static void printAllEmployees(ArrayList<? extends Employee> list) {
        for (Employee employee : list)
            System.out.println(employee);
    }

    public static void printAllEmployeesOrderBySalary(ArrayList<? extends Employee> list){
        TreeMap<Double, Employee> lst = new TreeMap();
        for (Employee employee : list){
            lst.put(employee.getSalary(), employee);
        }
        for (Map.Entry<Double, Employee> entry : lst.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
