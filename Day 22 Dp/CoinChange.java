// 322
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 0; i <= amount; i++){
            dp[i] = amount + 1;
        }

        dp[0] = 0;
        for(int i = 1; i<= amount; i++){
            for(int c : coins){
                if(i - c >= 0){
                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);
                }
            }
        }
        return dp[amount] > amount ? -1: dp[amount]; 
    }
    public static void main(String[] args) {
        CoinChange obj = new CoinChange();

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = obj.coinChange(coins, amount);

        if(result == -1){
            System.out.println("Not possible to make the amount");
        } else {
            System.out.println("Minimum coins required: " + result);
        }
    } 
}