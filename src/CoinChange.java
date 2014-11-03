public class CoinChange {
    public static void main(String[] args) {
        int[] array = {1,5,10};
        System.out.println(getCount(10, array));
    }

    public static int getCount(int sum, int[] denominations){
        int[] sums = new int[sum+1];
        sums[0] = 1;

        for(int iCoin = 0; iCoin < denominations.length; iCoin++){
            for(int iSum = denominations[iCoin]; iSum <= sum; iSum++){
                sums[iSum] = sums[iSum] + sums[iSum - denominations[iCoin]];
            }
        }
        return sums[sum];
    }
}
