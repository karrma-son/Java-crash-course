package Loops;

public class ForLoop {

    public static void loop1(){
        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
    }

    public static void loop2(){
       int one = 1;
       int two = 20;
       for (char j ='a'; j <= 'z'; j++, one++, two = two + 20 ){
           System.out.println(one + " " + two + " " +j);
       }

    }

    public static void Break(){
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
            if( i == 20){
                break;
            }

        }
    }

     public static void Continue(){
        for (int i = 0; i <= 40; i++ ){
            System.out.println("Current Value: " + i);
            if( i != 40 ) {
                continue;
            }

            System.out.println(i);
        }
     }

    public static void main(){
     Continue();
    }
}


