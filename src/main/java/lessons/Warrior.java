package lessons;

public class Warrior extends Hero{

    public Warrior(){
        super("Warrior");
    }

    @Override
    public void heroGreeting() {
        System.out.println("The Warrior Yells");
    }
}
