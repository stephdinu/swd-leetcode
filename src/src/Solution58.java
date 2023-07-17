public class Solution58 {
    // #58
    // Given a string s consisting of words and spaces,
    // return the length of the last word in the string.
    // A word is a maximal substring
    // consisting of non-space characters only.
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int finalIndex = words.length - 1;

        return words[finalIndex].length();
    }
}
