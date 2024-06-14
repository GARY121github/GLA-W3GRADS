package DAY_03;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        boolean isOnePresent = false;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= 0 || arr[i] > arr.length){
                arr[i] = 1;
            } else if (arr[i] == 1) {
                isOnePresent = true;
            }
        }

        if(!isOnePresent){
            return 1;
        }


        for(int i = 0 ; i < arr.length ; i++){
            int index = Math.abs(arr[i]) - 1;

            if(arr[index] > 0){
                arr[index] *= -1;
            }
        }

        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                ans = i+1;
                break;
            }
        }
        return ans == 0 ? arr.length + 1 : ans;
    }
}
