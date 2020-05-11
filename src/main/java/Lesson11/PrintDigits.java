package Lesson11;

public class PrintDigits {
    public static void main(String[] args) {
        System.out.println(printDigits(321));
    }

    public static String printDigits(int n){
        if(n<10){return new String(String.valueOf(n));

        }
        else { return printDigits(n/10)+"-"+printDigits(n%10);}



    }
}
