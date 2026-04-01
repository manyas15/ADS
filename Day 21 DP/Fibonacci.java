import java.util.*;
public class Fibonacci {
    public int fibnocci(int n, int dp[]){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = fibnocci(n - 1, dp) + fibnocci(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args){
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibnocci(n, dp));
    }
}
