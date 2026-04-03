package Workout;

public class Aerobics implements WorkoutFunctionality{

    String type;
    Integer length;

    public Aerobics (){
        this.type = "Running";
        this.length = 5;
    }

    @Override
    public void squats() {
        System.out.println("Not Today");
    }

    @Override
    public void deadlift() {
        System.out.println("Not Today");
    }

    @Override
    public void benchPress() {
        System.out.println("Not Today");
    }

    public void running (){
        System.out.println("Today we going to be " + type + " for " + length + " miles");
    }
}
