package arrays;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        
        // java type declaration
        int [] arr = {1 , 2 , 3 , 4 , 5};

        // c type array
        int brr[] = {10 , 20 , 30 , 40 , 50};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
//        swap1(arr , brr);
//        swap2(arr);
        swap3(arr[0] , arr[1]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

    }
//    Important to prove call by value int JAVA

    static void swap1(int[] arr , int[] brr){
        int[] temp = arr;
        arr = brr;
        brr = temp;
    }

    static void swap2(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

//    home work
     static void swap3(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
