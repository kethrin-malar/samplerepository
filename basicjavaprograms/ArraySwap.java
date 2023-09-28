public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();

        int n = 2;
        int ways = solution.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways); // Output: 2
    }
}
