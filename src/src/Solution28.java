public class Solution28 {
    // #28
    // Given two strings needle and haystack, return the index
    // of the first occurrence of needle in haystack, or -1
    // if needle is not part of haystack.
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) {
            return -1;
        }
        if(haystack.equals(needle)) {
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }
}
