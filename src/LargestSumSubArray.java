public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] array = {6,7,8,-10,1,1};
        System.out.println(getLargestSumSubArray(array));
    }

    public static int getLargestSumSubArray(int[] array){
        int maxSumAtI = 0;
        int maxSum = 0;
        int start = 0;
        int end = 0;

        int tempStart = 0;

        for(int i = 0; i < array.length; i++){
            if(maxSum == 0) {
                start = i;
            }
            maxSumAtI = maxSumAtI + array[i];
            if(maxSumAtI < 0){
                maxSumAtI = 0;
                tempStart = i+1;
            }
            if(maxSum < maxSumAtI){
                maxSum = maxSumAtI;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Start = " + start);
        System.out.println("End = " + end);

        return maxSum;
    }
}
