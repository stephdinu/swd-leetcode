import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    // #119
    // Given an integer rowIndex
    // return the rowIndexth (0-indexed) row of the Pascal's triangle.
    // In Pascal's triangle, each number is the sum
    // of the two numbers directly above it
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();

        row.add(1);
        if (rowIndex == 0) {
            return row;
        }
        List<Integer> prev = getRow(rowIndex - 1);
        for(int i = 1; i < prev.size(); i++) {
            int n = prev.get(i-1) + prev.get(i);
            row.add(n);
        }
        row.add(1);

        return row;
    }
}
