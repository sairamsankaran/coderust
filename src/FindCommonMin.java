public class FindCommonMin {
    public static void main(String[] args) {
        int[] array1 = {2,5,6};
        int[] array2 = {6,7,8};
        int[] array3 = {2,3,9};
        System.out.println(findCommonMinFromArrays(array1, array2, array3)); // O(m+n+o)
    }

    public static int findCommonMinFromArrays(int[] array1, int[] array2, int[] array3){
        // assumption - arrays are sorted

        // start by assuming first element is common min
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        int length1 = array1.length;
        int length2 = array2.length;
        int length3 = array3.length;

        int largest;

        while(index1 < length1 && index2 < length2 && index3 < length3){
            if(array1[index1] == array2[index2] && array1[index1] == array3[index3]){
                return array1[index1];
            }

            largest = array1[index1];
            if(array2[index2] > largest) {
                largest = array2[index2];
            }
            if(array3[index3] > largest) {
                largest = array3[index3];
            }

            while(index1 < length1 && array1[index1] < largest) {
                index1 = index1 + 1;
            }
            while(index2 < length2 && array2[index2] < largest) {
                index2 = index2 + 1;
            }
            while(index3 < length3 && array3[index3] < largest) {
                index3 = index3 + 1;
            }
        }
        return -1;
    }
}
