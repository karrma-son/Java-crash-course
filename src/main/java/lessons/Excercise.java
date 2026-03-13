package lessons;

import java.lang.reflect.Array;
import java.lang.reflect.Member;

public class Excercise {

    public static void addition(int one, int two) {
        int total = one + two;
        System.out.println(total);
    }

    public static void main() {
        int var1 = 2;
        int var2 = 3;
        addition(var1, var2);


        int var3 = 69;
        int var4 = 67;
        addition(var3, var4);

        int var5 = 14;
        int var6 = 16;
        addition(var5, var6);
        Avengers(4);
        Avengers(6);
        Avengers(3);
    }

    public static void Avengers( int roster){
        if(roster >= 5 || roster < 0){
            System.out.println("You are out of range");
            return;
        }

        String[] Members = new String[5];
        Members[0] = "Hawkeye";
        Members[1] = "Hulk";
        Members[2] = "Thor";
        Members[3] = "Falcon";
        Members [4] = "Scarlett Witch";

        JLA();
        System.out.println(Members[roster]);

    }

  public static void JLA (){
        String[] League = new String[5];
        League[0] = "Aqua-man";
        League[1] = "Vision";
        League[2] = "Green Lantern";
        League[3] = "Green Arrow";
        League[4] = "Cyborg";
        for(int i = 0; i < League.length; i++){
        System.out.println(League[i]);
      }


  }

}
