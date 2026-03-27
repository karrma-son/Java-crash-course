package lessons;

public class Wizard extends Hero{

    public Wizard(String W){
        super("New");
        System.out.println("This is the first");
    }

    public Wizard(double v){

    }

    public Wizard(int Wiz){
        super("Old");
        super.heroGreeting();
    }
}
