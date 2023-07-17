public class Solution69 {
    // #69
    // Given a non-negative integer x,return the square root of x
    // rounded down to the nearest integer.
    // The returned integer should be non-negative as well.
    // You must not use any built-in exponent function or operator.
    public int mySqrt(int x) {
        int first = 1;
        int last = x;

        if(x == 0) {
            return x;
        }
        while(first <= last) {
            int mid = first + (last - first)/2;
            if(mid * mid == x) {
                return mid;
            }
            else if(mid > x/mid) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return last;
    }
}
