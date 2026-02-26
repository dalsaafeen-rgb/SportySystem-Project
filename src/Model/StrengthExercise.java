

package Model;

public class StrengthExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("Performing strength training workout.");
    }

    @Override
    public String getName() {
        return "Strength Exercise";
    }
    @Override
public String getDetails() {
    return "Strength training improves muscle power.";
}
}