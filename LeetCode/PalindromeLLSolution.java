public class PalindromeLLSolution {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode prevSlowNode = null;
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;

            ListNode nextSlowNode = slowNode.next;

            slowNode.next = prevSlowNode;

            prevSlowNode = slowNode;

            slowNode = nextSlowNode;
        }

        ListNode firstHalfPointer = prevSlowNode;

        ListNode secondHalfPointer = null;

        if (fastNode == null) {
            secondHalfPointer = slowNode;
        } else if (fastNode.next == null) {
            secondHalfPointer = slowNode.next;
        }

        while (firstHalfPointer != null && secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) {
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

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
