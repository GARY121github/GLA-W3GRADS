package DAY_04;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(maxSubstringWithoutRepeatingCharacter(str));
    }

    static int maxSubstringWithoutRepeatingCharacter(String st){
        int maxWindow = 0;
        int s = 0;
        int e = 0;
        int[] arr = new int[256];
        while (e < st.length()){
//            GROW
            int index = st.charAt(e);
            arr[index]++;

//            SHRINK
            while (arr[index] == 2){
                int r_index = st.charAt(s);
                arr[r_index]--;
                s++;
            }

//            TASK
            int curr = e - s + 1;
            maxWindow = Math.max(curr , maxWindow);
            e++;
        }
        return maxWindow;
    }
}
