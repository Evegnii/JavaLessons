package Lesson9;

import java.util.Arrays;

public class LongestSequense {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 1, 2, 3,7};
        System.out.println(func(arr));

    }

    public static int func(int[] arr) {
        int[] results = new int[arr.length];
        for (int i = 0; i < results.length; i++) {  //длинна любой секвенции минимум 1
            results[i] = 1;
        }

        for (int i=0;i<arr.length;i++){  //тут я пошел в другую сторону чем у других но все ровно O(n^2)
            int prev=arr[i];
            for (int j=i+1;j<arr.length;j++){
             if(prev<arr[j] ){
                 prev=arr[j];
                 results[i]+=1;
             }
            }

        }
        //возьмем максимальное значение
        Arrays.sort(results);
        int result=results[results.length-1];
        return result;
    }

}
