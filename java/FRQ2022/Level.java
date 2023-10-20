public class Level {
    boolean completed = false;
    int points = 200;
    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached() {  
        return this.completed;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {  /* Level one 200, level two 100, level three 500 */
        return this.points;
    }
      
    public void setCompleted(boolean completed) { // setter
        this.completed = completed;     // instance variable on the left, local variable on the right
    }

    public void setPoints(int points) { // setter
        this.points = points;     // instance variable on the left, local variable on the right
    }

    public static void main(String[] args) {
        System.out.println("work");
    }
    // there may be instance variables, constructors, and methods that are not shown.
}