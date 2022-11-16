import java.util.ArrayList;

/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;

        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;

        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);

        while ((head = head.next) != null)
            list.add(head);

        if (list.size() != 2) {
            for (int i = 0; i < list.size() / 2; i++) {
                var j = list.size() - (i + 1);
                System.out.println(String.format("%s == %s", list.get(i).val, list.get(j).val));
                if (list.get(i).val != list.get(j).val)
                    return false;
            }
        } else
            return list.get(0).val == list.get(1).val;
        return true;
    }

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

}
