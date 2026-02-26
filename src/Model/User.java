
package Model;


public class User {
 protected int userID;
    protected String name;
    protected String fitnessGoal;

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }

      public void setGoal(String goal) {
        this.fitnessGoal = goal;
    }

    public String getName() {
        return name;
    }
}
    
