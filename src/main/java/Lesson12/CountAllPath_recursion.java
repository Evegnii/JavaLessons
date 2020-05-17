package Lesson12;

public class CountAllPath_recursion {
    public static int CAPfunc(int n,int m){
        if(n==1 || m==1){
            return 1;
        }
        return CAPfunc(n-1,m)+CAPfunc(n,m-1);
    }



    public static void main(String[] args) {
        System.out.println(CAPfunc(3,3));
    }

}
