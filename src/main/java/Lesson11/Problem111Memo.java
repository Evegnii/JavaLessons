package Lesson11;

public class Problem111 {
    public static void main(String[] args) {
        System.out.println(problem111(50));

    }
    public static int problem111(int n ){

        if(n<0)return -1;
        if (n==1)return 2;
        if (n==2)return 4;
        if (n==3)return 7;

        return problem111(n-1)+problem111(n-2)+problem111(n-3);
    }
}
//f(n)=f(n-1)+f(n-2)+f(n-3);