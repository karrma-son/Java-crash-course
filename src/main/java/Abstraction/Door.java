package Abstraction;

public class Door extends BasicActions{

    public Door() {
        super("Door");
    }

    @Override
    public void slam() {

        System.out.println("Please don't slam the: " + type);
    }
}
