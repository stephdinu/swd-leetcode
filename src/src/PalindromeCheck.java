public class PalindromeCheck {
    // #5
    //Given an integer x, return true if x is a
    //palindrome, and false otherwise.
    public boolean isPalindrome(int x) {
        int check = x;
        int rest = 0;
        int sum = 0;

        while (x > 0) {
            rest = x % 10;
            sum = sum*10 + rest;
            x = x / 10;
        }

        if (sum == check) {
            return true;
        }

        return false;
    }

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
