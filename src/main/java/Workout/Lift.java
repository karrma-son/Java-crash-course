package Workout;

public class Lift implements WorkoutFunctionality {

    String type;
    Integer weight;

    public Lift(){
        this.type = "Workout1";
        this.weight = 120;
    }

    @Override
    public void squats() {
        System.out.println("You must do 10 squats " + weight + " for: " + type);
    }

    @Override
    public void deadlift() {
        System.out.println("You must do 1 deadlift of " + weight + " for: " + type);
    }

    @Override
    public void benchPress() {
        System.out.println("You must do 10 bench press of " + weight + " for: " + type);

    }
}

