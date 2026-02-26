
package Controller;

import Model.Exercise;
import Model.User;
import Model.WorkoutProgram;

public class WorkoutController {
   
    public void startWorkout(User user, WorkoutProgram program) {
        System.out.println(user.getName() + " started workout.");

        for (Exercise ex : program.getExercises()) {
            System.out.println(ex.getDetails());
        }

        System.out.println("Workout Finished!");
    }
    
}
