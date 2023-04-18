import java.util.*;

public class leetcode118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // base case
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        if (numRows == 1) {
            return triangle;
        }
        List<Integer> second_row = new ArrayList<>();
        second_row.add(1);
        second_row.add(1);
        triangle.add(second_row);
        List<Integer> prev_row = second_row;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);
            for (int j = 1; j < i - 1; j++) {
                new_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            new_row.add(1);
            triangle.add(new_row);
            prev_row = new_row;
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(10));
    }
}
