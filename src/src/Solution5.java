public class Solution5 {
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
}
