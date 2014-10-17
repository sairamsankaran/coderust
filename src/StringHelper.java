public class StringHelper {
    public static String reverseString(String input){
        if (input == null) {
            return null;
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        for(int i = length-1; i >= 0; i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
