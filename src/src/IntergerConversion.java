public class IntergerConversion {
    // #13
    //Given a roman numeral, convert it to an integer.
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = numToInt(s.charAt(i));
            if (i+1 < s.length()) {
                int s2 = numToInt(s.charAt(i+1));
                if (s1 >= s2) {
                    sum = sum + s1;
                }
                else {
                    sum = sum - s1;
                }
            }
            else {
                sum = sum + s1;
            }
        }
        return sum;
    }

    private int numToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
