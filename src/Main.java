import java.util.Scanner;

public class Main {
    public static int sumOfSquares(int n) {
        //Time complexity is O(n), function call itself n times from n to 1
        //Space complexity is O(n) each recursive call takes place in stack, starting from n to 1
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }
    public static int sumOfElements(int[] array, int n){

    }
}