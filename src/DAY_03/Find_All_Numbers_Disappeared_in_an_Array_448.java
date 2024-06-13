package DAY_03;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            int index = Math.abs(arr[i]) - 1;
//            System.out.println(index);
            if(arr[index] < 0){

            }
            else{
                arr[index] *= -1;
            }
        }
//        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length  ; i++){
            if(arr[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
}
