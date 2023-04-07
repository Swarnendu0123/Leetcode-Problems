import java.util.*;

public class leetcode167 {

    public static int[] twoSum(int[] data, int target) {
        int a_pointer = 0;
        int b_pointer = data.length - 1;
        int ans[] = new int[2];
        while (a_pointer <= b_pointer) {
            int sum = data[a_pointer] + data[b_pointer];
            if (sum == target) {

                ans[0] = a_pointer + 1;
                ans[1] = b_pointer + 1;
                return ans;
            } else if (sum < target)
                a_pointer++;
            else if (sum > target)
                b_pointer--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data[] = new int[in.nextInt()];
        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] ans=twoSum(data, target); 
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
