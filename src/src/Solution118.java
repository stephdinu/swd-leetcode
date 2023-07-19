import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    // #118
    // Given an integer numRows
    // return the first numRows of Pascal's triangle.
    // In Pascal's triangle, each number is the sum
    // of the two numbers directly above it
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < numRows; i++) {
            row.add(0,1);
            for (int j = 1; j < row.size()-1; j++) {
                row.set(j, row.get(j) + row.get(j+1));
            }
            triangle.add(new ArrayList<Integer> (row));
        }
        return triangle;
    }
}
