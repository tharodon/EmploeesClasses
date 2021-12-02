public class JavaDeveloper extends Developer{
    private int experience;
    private String IDE;

    public JavaDeveloper(String developmentLanguage, String university, int experience, String IDE) {
        super(developmentLanguage, university);
        this.experience = experience;
        this.IDE = IDE;
    }

    public JavaDeveloper(String name, String surname, double salary, String developmentLanguage, String university, int experience, String IDE) {
        super(name, surname, salary, developmentLanguage, university);
        this.experience = experience;
        this.IDE = IDE;
    }

    public JavaDeveloper(int experience, String IDE) {
        this.experience = experience;
        this.IDE = IDE;
    }

    public JavaDeveloper() {

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return super.toString() + "experience=" + experience +
                ", IDE='" + IDE + '\'';
    }
}
