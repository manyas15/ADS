public class ClimbStairs{
    // if we are at n step
    // we can come from n-1 step or n-2 step
    public int climbStairs(int n) {
        if(n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // dp[1] = 1
    // dp[2] = 2
    // i = 3..
    // dp[3] = dp[2] + dp[1] = 2 + 1 = 3
    // dp[4] = dp[3] + dp[2] = 3 + 2 = 5
    // dp[5] = dp[4] + dp[3] = 5 + 3 = 8

    public static void main(String[] args) {
        ClimbStairs solution = new ClimbStairs();
        int n = 5;
        int result = solution.climbStairs(n);
        System.out.println(result); // Output: 8
    }

}