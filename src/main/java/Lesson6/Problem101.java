package Lesson6;

public class Problem101 {
    public static int HowManyCombinations(int n ){
        int[] arr=new int[n+1];   //когда я выписал на бумажке я увидел что это фибоначи
        arr[1]=2;    // я знаю где старт но до конца обяснить я не могу как значения взрдят в друг друга
        arr[2]=3;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(HowManyCombinations(5));
    }
}
