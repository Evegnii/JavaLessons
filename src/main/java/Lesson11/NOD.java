package Lesson11;

public class NOD {
    public static void main(String[] args) {
        System.out.println(NODfunck(21, 14));
    }

    public static int NODfunck(int n, int t) {
        if (n == t) return n;
        else {
            if (n > t) {
                return NODfunck(n - t, t);
            } else {
                return NODfunck(n, t - n);
            }
        }
    }
    public static int NODfunck1(int n, int t) {
        if (n == t) return n;
        else {
            if (n < t) {
                return NODfunck(n - t, t);
            } else {
                return NODfunck(n, t - n);
            }
        }
    }
}
