
package Model;
public class CardioExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("Performing cardio workout.");
    }

    @Override
    public String getName() {
        return "Cardio Exercise";
    }
    @Override
public String getDetails() {
    return "Cardio exercise improves heart health.";}
}
