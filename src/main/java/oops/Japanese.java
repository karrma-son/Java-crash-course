package oops;

public class Japanese extends Language {

    public Japanese() {
        super("Japanese");
    }

    @Override
    public void sayHello() {
        System.out.println("Konichiwa");
    }
}
