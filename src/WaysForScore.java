public class WaysForScore {
    public static void main(String[] args) {
        printCombinationsForSumHelper(4, new StringBuffer());
    }

    public static void printCombinationsForSumHelper(int sum, StringBuffer sb){
        if(sum == 0){
            System.out.println(sb.toString());
            return;
        }
        if(sum >= 1){
            printCombinationsForSumHelper(sum - 1, new StringBuffer(sb).append("1"));
        }
        if(sum >= 2) {
            printCombinationsForSumHelper(sum - 2, new StringBuffer(sb).append("2"));
        }
        if(sum >= 4) {
            printCombinationsForSumHelper(sum - 4, new StringBuffer(sb).append("4"));
        }
    }
}
