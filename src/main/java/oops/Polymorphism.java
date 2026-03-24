package oops;

public class Polymorphism {

    public static int sum(){
        return 0;
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum (int[] numArray){
        int result = 0;

        for(int i = 0; i< numArray.length; i++){
           result = numArray[i] + result;
        }

        return result;
    }
    public static void main(String[] args) {
        Japanese japaneseLanguage = new Japanese();
        German germanLanguage = new German();
        English englishLanguage = new English();

        japaneseLanguage.sayHello();
        germanLanguage.sayHello();
        englishLanguage.sayHello();

        int sum1 = sum();
        int sum2 = sum(3, 4);

        int [] newArray = new int[4];
        newArray [0] = 4;
        newArray[1] = 9;
        newArray[2] = 10;
        newArray[3] = 2;
        int sum3 = sum(newArray);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}
