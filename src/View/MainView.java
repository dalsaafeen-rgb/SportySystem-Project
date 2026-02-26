

package View;

import Controller.WorkoutController;
import Model.Exercise;
import Model.ExerciseFactory;
import Model.User;
import Model.WorkoutProgram;


public class MainView {
    
    public static void main(String[] args) {

        User user = new User(1, "Ahmad");
        user.setGoal("Build Muscle");

        Exercise ex1 = ExerciseFactory.createExercise("Strength");
        Exercise ex2 = ExerciseFactory.createExercise("Cardio");

        ex1.perform();
        ex2.perform();

        WorkoutProgram program = new WorkoutProgram("Build Muscle");
        program.addExercise(ex1);
        program.addExercise(ex2);

        WorkoutController controller = new WorkoutController();
        controller.startWorkout(user, program);
    }
    
}
 