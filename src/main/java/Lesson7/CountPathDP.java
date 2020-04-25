package Lesson7;

public class CountPathDP {

    static int CountPathDPfunc(int m,int n){
        int [][] count =new int[m][n];
        for(int i=0;i<m;i++){
            count[i][0]=1;
        }
        for(int j=0;j<m;j++){
            count[0][j]=1;
        }

        for (int i =1;i<m-1;i++){
            for (int j =1;j<n-1;i++){
                count[i][j]=count[i-1][j]+count[i][j-1];   //ArrayIndexOutOfBoundsException:  почему ??
            }
        }
        return count[m-1][n-1];



    }

    public static void main(String[] args) {
        System.out.println(CountPathDPfunc(4,4));
    }
}
