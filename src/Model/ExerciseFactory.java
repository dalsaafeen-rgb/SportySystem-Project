
package Model;

public class ExerciseFactory {
      public static Exercise createExercise(String type) {

        if (type.equalsIgnoreCase("Strength")) {
            return new StrengthExercise();
        }
        else if (type.equalsIgnoreCase("Cardio")) {
            return new CardioExercise();
        }
        else {
            return null;
        }
    }
    
}
