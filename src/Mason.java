import java.util.Arrays;

public class Mason extends Employee{
    private int[] NewtonsLaws;

    public String[] getNewtonsLaws() {
        String[] laws = new String[3];
        if (NewtonsLaws[0] == 1)
            laws[0] = "Every body continues to be held in its state of rest or uniform and rectilinear " +
                    "motion, as long as and insofar as it is compelled by the applied forces to change this state.";
        if (NewtonsLaws[1] == 1)
            laws[1] = "The change in the momentum is proportional to the applied driving force and occurs in " +
                    "the direction of the straight line along which this force acts.";
        if (NewtonsLaws[2] == 1)
            laws[2] = "Action is always equal and opposite reaction, otherwise the interactions of two bodies against " +
                    "each other are equal and directed in opposite directions.";
        return laws;
    }

    public Mason(int[] newtonsLaws) {
        NewtonsLaws = newtonsLaws;
    }

    public Mason(String name, String surname, double salary, int[] newtonsLaws) {
        super(name, surname, 3, salary);
        NewtonsLaws = newtonsLaws;
    }

    @Override
    public String toString() {
        return super.toString() + "know this NewtonsLaws: " + Arrays.toString(NewtonsLaws);
    }
}
