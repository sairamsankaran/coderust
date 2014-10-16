import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("geeksforgeeks"));
    }

    public static String removeDuplicates(String input){
        int length = input.length();
        StringBuilder sb = new StringBuilder();
        Set<Character> uniqueSet = new HashSet<Character>();
        for(int i = 0; i < length; i++){ // O(n)
            char c = input.charAt(i);
            if(!uniqueSet.contains(c)){
                uniqueSet.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
