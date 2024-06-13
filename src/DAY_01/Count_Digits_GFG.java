package DAY_01;

// question link -> https://www.geeksforgeeks.org/problems/count-digits5716/1
public class Count_Digits_GFG {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(evenlyDivides(n));
    }
    static int evenlyDivides(int N){
        int count = 0;
        int n = N;
        while(n > 0){
            int digit = n % 10;
            if(digit != 0 && N % digit == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
