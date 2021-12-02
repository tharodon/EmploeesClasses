public class Employee {
    private String name;
    private String surname;
    private String position;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee () {
    }

    public Employee(String name, String surname, int position, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        if (position == 0)
            this.position = "Installer";
        else if (position == 1)
            this.position = "Electronics engineer";
        else if (position == 2)
            this.position = "Developer";
        else
            this.position = "Empty";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }
}
