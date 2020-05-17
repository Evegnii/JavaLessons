package Lesson12;

public class CountShortPath {
    public static int cspFunc(int [][] nums){
        int row = nums.length;
        int column = nums[1].length;

        for (int i=1;i<row;i++){
            nums[0][i]=nums[i-1][0]+nums[i][0];

        }
        for (int i=1;i<column;i++){
            nums[i][0]= nums[0][i-1]+nums[0][i];
        }
        for (int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                int leftCellSum=nums[i][j-1]+nums[i][j];
                int upCellSum=nums[i-1][j]+nums[i][j];
                int diagonalCellSum=nums[i-1][j-1]+nums[i][j];
                nums[i][j]=Math.min(leftCellSum,Math.min(diagonalCellSum,upCellSum));

            }        }
        return nums[row-1][column-1];

    }

    public static void main(String[] args) {
        int[][] table = {{0,3,7},{4,9,6},{2,5,0}};
        System.out.println(cspFunc(table));
    }
}
