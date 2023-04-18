import java.util.*;

public class pelindromicity {

    public static int check(int data[], int si, int ei) {
        int count = 0;
        int j = 0;
        for (int i = si; i <= (ei + si - 1) / 2; i++) {
            if (data[i] != data[ei - j]) {
                count++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data[] = new int[in.nextInt()];
        int subString_length = in.nextInt();
        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < data.length - subString_length + 1; i++) {
            int si = i;
            int ei = i + subString_length - 1;
            int temp = check(data, si, ei);
            ans += temp;
        }
        System.out.println(ans);
    }
}
