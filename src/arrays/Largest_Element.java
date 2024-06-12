package arrays;

import java.util.Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = { 10 , -1 , 20 ,3 , 4 , 30};

//        Brute Force : Time Complexity = O(n log n)
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

//        Optimal Solution : Time Complexity = O(n)
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
