package arrays.Reversal_Algo;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};

    }
    /*
    * Brute Force :-> Space Complexity = O(n) , Time Complexity = O(n)
    * */
    static void reverse1(int[] arr){
        System.out.println(Arrays.toString(arr));

        int[] brr = new int[arr.length];
        int p1 = arr.length - 1;
        int p2 = 0;
        while (p1 >= 0){
            brr[p2] = arr[p1];
            p1--;
            p2++;
        }

        arr = brr;
        System.out.println("Reversed Array");
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Optimal Solution :-> Space Complexity = O(1) , Time Complexity = O(n)
     * */
    static void reverse2(int[] arr){
        int p1 = 0;
        int p2 = arr.length-1;
        while (p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }

}
