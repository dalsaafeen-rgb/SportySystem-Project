package Model;


import java.util.ArrayList;
/**
 *
 * WorkoutProgramكلاس ال 
 */
public class WorkoutProgram {
     private String goalType;
    private ArrayList<Exercise> exercises;

    public WorkoutProgram(String goalType) {
        this.goalType = goalType;
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise ex) {
        exercises.add(ex);
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }
}
