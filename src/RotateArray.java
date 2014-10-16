public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int length = array.length;
        rotateArrayByN(array, 6); // O(kn)
        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] rotateArrayByN(int[] array, int k) {
        int length = array.length;
        for(int i = 1; i <= k; i++){ // O(k)
            array = rotateArrayBy1(array);
        }
        return array;
    }

    public static int[] rotateArrayBy1(int[] array){
        int length = array.length;
        int temp = array[length-1];
        for(int i = length-1; i > 0; i--){ // O(n)
            array[i] = array[i-1];
        }
        array[0] = temp;
        return array;
    }
}
