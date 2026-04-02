package Abstraction;

public class Gameboy implements ElectronicFunctionality{

    String type;

    public Gameboy() {
        this.type = "Gameboy";
    }

    @Override
    public void on() {
        System.out.println("The" + type + "is turned on");
    }

    @Override
    public void off() {
        System.out.println("Turning off the" + type);
    }

    @Override
    public void standby() {
        System.out.println("Would you like to put the" + type + " into standby mode?");

    }

    @Override
    public void restart() {
        System.out.println("About to restart the :" + type);
    }

    @Override
    public void printElectronic() {
        System.out.println(type);
    }
}
