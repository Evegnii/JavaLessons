package Lesson7;

public class CountPathRecursion {
    static int CountPathRecur(int m, int n ){
        if(m==1||n==1){return 1;
    }
     return CountPathRecur(m-1,n)+CountPathRecur(m,n-1);
}

    public static void main(String[] args) {
        System.out.println(CountPathRecur(3,3));
    }
}
