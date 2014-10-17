public class DivisionWithoutDivision {
    public static void main(String[] args) {
        System.out.println(divide(10,1));
    }

    public static int divide(int a, int b){
        // left shift by 1, <<, multiplies an integer by 2
        // right shift by 1, >>, divides an integer by 2
        // the logic here is to separate a into sums of integers
        // and then finding the quotient for each number in the sum
        // and adding up the quotients
        // identify which power of 2 when multiplied by b, will give the partial sum

        /*
        e.g.: a = 10, b = 3
        we need to find r, such that 10 = r*3
        r can be pow(2,n) i.e. 2 raised to some power n
        find this largest r such that 10 >= r*3
        so, keep multiplying 3 by 2 until the product exceeds 10
        in order to get r, we start from 1, keep multiplying by 2
        when we find the right r, we add it as part of the quotient
        subtract the r*3 from 10, and repeat the process again
        the calculation would look like
        10/3 = (6 + 3 + 1)/3 = 6/3 + 3/3 + 1/3 = (2*3)/3 + 1 + 0 = 2 + 1 = 3
        */

        int quotient = 1;
        if(a < b){
            return 0;
        }
        if(a == b) {
            return 1;
        }
        int c = b;
        while(c < a){
            c = c << 1;
            quotient = quotient << 1;
        }
        c = c >> 1;
        quotient = quotient >> 1;

        return quotient + divide(a-c, b);
    }
}
