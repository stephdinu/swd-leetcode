public class Solution67 {
    // #67
    // Given two binary strings a and b,
    // return their sum as a binary string.
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        //two pointers starting from the back

        while(i >= 0 || j >= 0 || carry == 1) {
            if(i >= 0) {
                //we subtract '0' to get the int value of the char from the ascii
                carry += a.charAt(i--) - '0';
            }
            if(j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
