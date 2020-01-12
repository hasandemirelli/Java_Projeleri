public class CoinRow {
 
    public static int getMaximumAmount(int[] coins) {
        assert coins.length > 0 : "coins seçilemedi";
 
        int[] C = new int[coins.length + 1];
        for (int i = 0; i < coins.length; i++) {
            C[i + 1] = coins[i];
        }
 
        int[] F = new int[coins.length + 1];
        F[0] = 0;
        F[1] = C[1];
 
        for (int i = 2; i <= coins.length; i++) {
            F[i] = max(C[i] + F[i - 2], F[i - 1]);
        }
        return F[coins.length];
    }
 
    private static Integer max(int i, int j) {
        return i > j ? i : j;
    }
 
    public static void main(String[] args) {
        int[] coins = { 5, 1, 2, 10, 6};
        System.out.println(getMaximumAmount(coins));
    }
}