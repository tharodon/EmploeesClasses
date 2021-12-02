public class Developer extends Employee{

    private String developmentLanguage;
    private String university;

    public Developer(String developmentLanguage, String university) {
        this.developmentLanguage = developmentLanguage;
        this.university = university;
    }

    public Developer(String name, String surname, double salary, String developmentLanguage, String university) {
        super(name, surname, 2, salary);
        this.developmentLanguage = developmentLanguage;
        this.university = university;
    }

    public Developer() {

    }

    public String getDevelopmentLanguage() {
        return developmentLanguage;
    }

    public void setDevelopmentLanguage(String developmentLanguage) {
        this.developmentLanguage = developmentLanguage;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " developmentLanguage='" + developmentLanguage + ", " + '\'' +
                ", university='" + university + '\'';
    }
}
