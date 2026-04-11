package Loops;

public class ForLoop2 {

    public static void For1(){

        for(int i  = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void For2(){
        for( int j = 0; j <= 100; j++){
            System.out.println(j);
            if(j == 50){
               break;
            }
        }
    }

    public static void For3(){
        for (int k = 0; k <= 100; k++){
            if ( k != 50){
                continue;

            }
            System.out.println(k);
        }
    }

    public static void For4(){
        for(int i = 100; i >= 0; i-- ){
            System.out.println(i);
        }
    }

    static void main(){
//        For1();
//        For2();
//        For3();
        For4();
    }
}

