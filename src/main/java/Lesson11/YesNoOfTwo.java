package Lesson11;

public class YesNoOfTwo {
    public static void main(String[] args) {
        System.out.println(yesOrNO(128));
    }

    public static boolean yesOrNO(int n) {
        if (n == 2) return true;

        else {
            if (n % 2 == 0 && n>2) return yesOrNO(n / 2);
            else return false;
        }
    }
}
