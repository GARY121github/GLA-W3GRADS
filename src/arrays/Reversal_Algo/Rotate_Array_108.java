package arrays.Reversal_Algo;

import java.util.Arrays;

public class Rotate_Array_108 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr , k);
        System.out.println(Arrays.toString(arr));

    }

//    BRUTE FORCE : SPACE COMPLEXITY = O(1) , TIME COMPLEXITY = O(n^2)
//    public void rotate(int[] arr, int k) {
//        for(int i = 1 ; i <= k ; i++){
//            rotateArray(arr);
//        }
//    }
//
//    private void rotateArray(int[] arr){
//        int temp = arr[arr.length - 1];
//        for(int i = arr.length - 1 ; i > 0 ; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = temp;
//    }


//    BRUTE FORCE : SPACE COMPLEXITY = O(1) , TIME COMPLEXITY = O(n^2)
//    public void rotate(int[] arr, int k) {
//          when k > n
//        k = k % arr.length;
//        for(int i = 1 ; i <= k ; i++){
//            rotateArray(arr);
//        }
//    }
//
//    private void rotateArray(int[] arr){
//        int temp = arr[arr.length - 1];
//        for(int i = arr.length - 1 ; i > 0 ; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = temp;
//    }


    // OPTIMAL SOLUTION
//    SPACE COMPLEXITY : O(1) , TIME COMPLEXITY = O(n)
    static void rotate(int[] arr, int k) {
        k = k % arr.length;
        // reverse whole array
        reverse(arr , 0 , arr.length-1);

        // reverse 0 -> k-1
        reverse(arr , 0 , k-1);

        // reverse k -> arr.length - 1
        reverse(arr , k , arr.length-1);
    }

    static void reverse(int[] arr , int p1 , int p2){
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }
}
