public class StringCombinations {
    public static void main(String[] args) {
        combineString("abc");
    }

    public static void combineString(String input){
        combineStringHelper("abc", 0, new StringBuffer());
    }

    public static void combineStringHelper(String input, int start, StringBuffer sb){
        int length = input.length();
        for(int i = start; i < length; i++){
            sb.append(input.charAt(i));
            System.out.println(sb.toString());
            if(i < length-1) { // all characters visited. nothing more to combine
                combineStringHelper(input, i + 1, sb);
            }
            sb.setLength(sb.length() - 1); // knock off how many ever levels you went deeper in the recursion
        }
    }
}
