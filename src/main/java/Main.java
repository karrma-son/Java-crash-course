import Abstraction.Door;
import Abstraction.ElectronicFunctionality;
import Abstraction.Gameboy;
import Abstraction.PS5;

public class Main {
    static void main(String[] args) {
//        PS5 playStation5 = new PS5();
//        playStation5.on();
//        playStation5.off();
//        playStation5.restart();
//        playStation5.standby();
//        playStation5.printElectronic();
//        System.out.println();
//        Gameboy gB = new Gameboy();
//        gB.on();
//        gB.off();
//        gB.restart();
//        gB.standby();
//        gB.printElectronic();
//
//        Door newDoor = new Door();
//        newDoor.open();
//        newDoor.close();
//        newDoor.print();
//        newDoor.slam();

        int a = 2;
        ElectronicFunctionality electronic;

        if(a == 1){
            electronic = new PS5();
        } else {
            electronic = new Gameboy();
        }

        electronic.on();
        electronic.off();
        electronic.restart();
        electronic.standby();
        electronic.printElectronic();
    }
}
