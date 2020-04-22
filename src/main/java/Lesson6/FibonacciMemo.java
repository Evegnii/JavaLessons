package Lesson6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemo {
     Map<Integer, Integer> memo = new HashMap<>();
     public int fibMem(int n) {

        if (n <= 1)
            return n;
        if (memo.containsKey(n)){
            return memo.get(n);   //check if we already have fib from this value
        }
         System.out.printf("computing fib(%d)\n", n);
         int result = fibMem(n - 1) + fibMem(n - 2);    //recursion step

         memo.put(n,result);   //base case

        return result;
    }

    public static void main(String args[]) {
         FibonacciMemo fibonacciMemo=new FibonacciMemo();
         int n = 5;
         int[] memo = new int[n + 1];
         System.out.println(fibonacciMemo.fibMem(n));


    }
}
