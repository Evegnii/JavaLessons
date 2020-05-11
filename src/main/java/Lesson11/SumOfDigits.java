package Lesson11;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(sumOfDigits(321));
        System.out.println(sumOfDigits(30));

    }

    public static int sumOfDigits(int n){
        if(n<10) return n;
        else return sumOfDigits(n/10+n%10) ;

    }
}
