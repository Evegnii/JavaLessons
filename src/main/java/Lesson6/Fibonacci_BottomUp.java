package Lesson6;

public class Fibonacci_BottomUp {
    public static int FibBmUp(int n){
        int [] memo =new int [n+1];
        memo[0]=0;
        memo[1]=1;
        for(int i=2;i<=n;i++){
            memo[i]=memo[i-1]+memo[i-2];   //зная выражение нижних значений,шаг и конечное значение нам не нужна рекурсия
        }
        return memo[n];

    }

    public static void main(String[] args) {
        System.out.println(FibBmUp(5));
    }
}
