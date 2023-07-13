public class Solution9 {
    // #9
    //Given a string s, return the longest
    //palindromic substring in s
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int len = 0; i + len < charArray.length; len++) {
                if (isPalindrome(charArray, i, len) && len + 1 > maxLen) {
                    maxLen = len + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public boolean isPalindrome(char[] charArray, int start, int len) {
        while (len > 0) {
            if (charArray[start] != charArray[start + len]) {
                return false;
            }

            start++;
            len -= 2;
        }

        return true;
    }
}
