package basics;

public class HCF {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
//        System.out.println(bruteForce(a , b));
        System.out.println(optimalSolution(a , b));
    }

     static int bruteForce(int a , int b){
        for(int i = Math.min(a , b); i >= 2 ; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    static int optimalSolution(int a , int b){
        while(a > 0 && b > 0) {
            // If a is greater than b
            if(a > b) {
                // Update a to the remainder of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            else {
                // Update b to the remainder of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }
}
