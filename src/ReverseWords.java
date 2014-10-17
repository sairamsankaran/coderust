/**
 * Created by ssankara on 10/17/14.
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("there was a big brown fox!"));
    }

    public static String reverseWords(String input){
        // reverse the complete sentence first
        String reverseInput = StringHelper.reverseString(input); // O(n)

        int length = reverseInput.length();

        StringBuilder sentenceBuffer = new StringBuilder(length);
        StringBuilder sb = new StringBuilder(); // temporary buffer for each word
        int i = 0;
        int nSpaces = 0;
        while(i < length){ // O(n)
            if(reverseInput.charAt(i) == 32){ // if you encounter a space
                if(sb.length() > 0) { // is there a temporary word to insert
                    if(nSpaces > 0) { // are there any spaces before this word
                        for(int j = 0; j < nSpaces; j++) {
                            sentenceBuffer.append(" "); // insert the spaces
                        }
                        nSpaces = 0;
                    }
                    sentenceBuffer.append(StringHelper.reverseString(sb.toString())); // reverse the word and insert it
                    sb = new StringBuilder(); // clear the buffer for the next word
                }
                nSpaces++;
            } else {
                sb.append(reverseInput.charAt(i)); // build the word to reverse
            }
            i++;
        }
        if(sb.length() > 0) {
            // for the last word
            if(nSpaces > 0) {
                for(int j = 0; j < nSpaces; j++) {
                    sentenceBuffer.append(" ");
                }
            }
            sentenceBuffer.append(StringHelper.reverseString(sb.toString())); // reverse the word
        }
        return sentenceBuffer.toString();
    }
}
