public class StringPermutations {
    public static void main(String[] args) {
        permuteString("abc");
    }

    public static void permuteString(String input) {
        permuteStringHelper("", input);
    }

    public static void permuteStringHelper(String prefixString, String remainingString) {
        if (remainingString.length() <= 1)
            System.out.println(prefixString + remainingString);
        else
            for (int i = 0; i < remainingString.length(); i++) {
                String newString = remainingString.substring(0, i) + remainingString.substring(i + 1);
                permuteStringHelper(prefixString + remainingString.charAt(i), newString);
            }
    }
}

