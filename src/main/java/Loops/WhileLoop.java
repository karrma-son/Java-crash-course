package Loops;

public class WhileLoop {

    public static void While1(){
        int i = 0;
        while(i < 10){

            System.out.println(i);
            i++;

        }
    }

    public static void While2(){
        int j = 10;
        while(j < 20){

            System.out.println(j);

            j+=3;
        }
    }

    public void main(){
//        While1();
        While2();
    }

}
