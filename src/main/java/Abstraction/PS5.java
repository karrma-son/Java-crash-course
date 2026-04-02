package Abstraction;

public class PS5 implements ElectronicFunctionality{

    String type;

    public PS5(){
        this.type = "Playstation 5";
    }

    @Override
    public void on() {
        System.out.println(type + ": Turned on!");
    }

    @Override
    public void off() {
        System.out.println( "Are you sure you want to turn the :" + type + "off?");

    }

    @Override
    public void standby() {
        System.out.println(type + ":is on Standby");

    }

    @Override
    public void restart() {
        System.out.println("About to restart :" + type);

    }

    @Override
    public void printElectronic() {
        System.out.println(type);
    }
}
