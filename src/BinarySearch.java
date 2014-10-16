public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(searchSortedArray(array,5));
    }

    public static int searchSortedArray(int[] array, int key){
        int start = 0;
        int end = array.length - 1;

        while(start <= end){ // take care of <= here
            int mid = start + (end - start)/2;
            if(array[mid] == key){
                return mid;
            } else if(array[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
