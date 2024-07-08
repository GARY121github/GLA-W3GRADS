package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {6 , 5 , 4 , 3 , 2 , 1};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr , int s , int e){
        if(s >= e){
            return;
        }

        int index = putLastElementAtRightIndex(arr , s , e);

        quickSort(arr , s , index-1);
        quickSort(arr , index+1 , e);
    }
    static int putLastElementAtRightIndex(int[] arr , int s , int e){
        int lastElement = arr[e];
        int position = s;
        for(int i = s ; i < e ; i++){
            if(arr[i] < lastElement){
                int t = arr[position];
                arr[position] = arr[i];
                arr[i] = t;
                position++;
            }
        }
        int t = arr[position];
        arr[position] = arr[e];
        arr[e] = t;
        return position;
    }
}
