public class FindInSortedRotatedArray {
    public static void main(String[] args) {
        int[] array1 = {6,7,8,9,10,3,4,5};
        System.out.println(find(array1, 11));
    }

    public static int find(int[] array, int k){
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(array[mid] == k){
                return mid;
            } else if(array[start] <= k && k < array[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
