package DAY_02.arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int [] arr = {10 , 10 , 30 ,1 , 4 , 50 , 6 , 50};
        System.out.println(secondLargest(arr));
    }
    /*
    * Time Complexity = O(n) , Space Complexity = o(1)
    * */
    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] != max && arr[i] > second_max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
}
