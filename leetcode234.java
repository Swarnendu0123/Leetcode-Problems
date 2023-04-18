import java.util.*;

public class leetcode234 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        temp = head;
        int i = 0;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
            i++;
        }
        int n = list.size();
        for (int j = 0; j < n / 2; j++) {
            if (list.get(j) != list.get(n - j - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
