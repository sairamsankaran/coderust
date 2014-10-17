public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(17));
    }

    public static int squareRoot(int n) {
        // return floor of square root
        // it should lie between 0 and n/2
        // use binary search to narrow it down
        int start = 0;
        int end = (n/2);
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid*mid <= n && (mid+1)*(mid+1) > n){ // since we are looking for floor(sq)
                return mid;
            } else if(mid*mid < n) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
