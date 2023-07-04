import java.util.Arrays;

public class PrefixCheck {
    //Write a function to find the longest common prefix string
    // amongst an array of strings. If there is no common prefix,
    // return an empty string "".
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        // base cases
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return strs[0];
        }
        // sort array strs
        Arrays.sort(strs);
        // find minimum length between first and last string in strs
        int minLength = Math.min(strs[0].length(), strs[size-1].length());
        // find last matching index of a possibly matching prefix
        int i = 0;
        while (i < minLength && strs[0].charAt(i) == strs[size-1].charAt(i)) {
            i++;
        }
        // store newly found prefix
        String prefix = strs[0].substring(0,i);
        // output prefix
        return prefix;
    }
}
