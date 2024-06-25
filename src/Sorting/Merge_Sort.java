package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        // int[] arr ={1 , 2 , 5};
        // int[] brr = {1 , 2 , 3 , 4 , 5};
        // int[] ans = mergeTwoSortedArray(arr , brr);
        // System.out.println(Arrays.toString(ans));
        int[] arr = {3 ,4, 1, 8 ,4 ,3 , 2};
        int[] ans = mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr , int s , int e){
        if(s == e){
            int[] a = new int[1];
            a[0] = arr[s];
            return a;
        }
        int mid = s + (e - s) / 2;
        int[] left = mergeSort(arr, s, mid);
        int[] right = mergeSort(arr, mid+1, e);
        return mergeTwoSortedArray(left , right);
    }

    private static int[] mergeTwoSortedArray(int[] arr , int[] brr){
        int i =0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr.length + brr.length];
        while(i < arr.length && j < brr.length){
            if(arr[i] <= brr[j]){
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k] = brr[j];
                j++;
            }
            k++;
        }

        while(i < arr.length){
            ans[k++] = arr[i++];
        }

        while(j < brr.length){
            ans[k++] = brr[j++];
        }

        return ans;
    }
}
