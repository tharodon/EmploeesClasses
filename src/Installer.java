public class Installer extends Employee{
    private String department;

    public Installer(String department) {
        this.department = department;
    }

    public Installer(String name, String surname, double salary, String department) {
        super(name, surname, 0, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() +  "department='" + department + '\'';
    }
}
