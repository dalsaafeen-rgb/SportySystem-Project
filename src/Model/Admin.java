package Model;

/**
 *
 * Adminكلاس ال 
 */
public class Admin extends User{
     public Admin(int userID, String name) {
        super(userID, name);
    }

    public void addExercise(Exercise exercise) {
        System.out.println("Exercise added: " + exercise.getName());
    }

    public void updateExercise(Exercise exercise) {
        System.out.println("Exercise updated: " + exercise.getName());
    }

    public void deleteExercise(Exercise exercise) {
        System.out.println("Exercise deleted: " + exercise.getName());
    }
}