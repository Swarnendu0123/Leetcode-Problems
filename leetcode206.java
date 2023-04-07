import java.util.*;

public class leetcode206 {

    public static class ListNode {
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

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = prev.next.next;
        head.next = null;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(10, null);
        ListNode ln2 = new ListNode(20, ln1);
        ListNode ln3 = new ListNode(30, ln2);
        ListNode temp = ln3;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("reverseing...");
        temp = reverseList(ln3);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
